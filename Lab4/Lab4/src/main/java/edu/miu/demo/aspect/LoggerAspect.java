package edu.miu.demo.aspect;
import edu.miu.demo.domain.ApplicationLogger;
import edu.miu.demo.service.ApplicationLoggerService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.time.ZoneId;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {

    @Autowired
    private ApplicationLoggerService applicationLoggerService;
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());


    @Around("execution(* edu.miu.demo.controller.*.*(..))")
    public Object around(ProceedingJoinPoint point) {
        Object result = null;
        long beginTime = System.currentTimeMillis();
        try {
            //Execution method
            result = point.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        //Save log
        try {
            saveLog(point, beginTime);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return result;
    }


    private void saveLog(ProceedingJoinPoint joinPoint, long time) throws Throwable {
        ApplicationLogger applicationLog = new ApplicationLogger();
        long start = System.nanoTime();
         joinPoint.proceed();
        long finish = System.nanoTime();
        System.out.println(joinPoint.getSignature().getName() + " takes ns: " + (finish - start));
        applicationLog.setTime(finish-start);
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();

        applicationLog.setDate(Instant.ofEpochMilli(time)
                .atZone(ZoneId.of("America/New_York")).toLocalDate());
        applicationLog.setOperation(request.getMethod());
        applicationLog.setPrinciple("Test Principle");
        applicationLog.setOperation("Test Operation");
        applicationLoggerService.saveApplicationLog(applicationLog);

    }


}

