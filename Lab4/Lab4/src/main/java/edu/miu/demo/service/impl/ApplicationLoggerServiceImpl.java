package edu.miu.demo.service.impl;

import edu.miu.demo.domain.ApplicationLogger;
import edu.miu.demo.repository.ApplicationLoggerRepository;
import edu.miu.demo.service.ApplicationLoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ApplicationLoggerServiceImpl implements ApplicationLoggerService {
        @Autowired
        private ApplicationLoggerRepository applicationLoggerRepository;


    @Override
    public void saveApplicationLog(ApplicationLogger applicationLogger) {
        applicationLoggerRepository.save(applicationLogger);
    }
}
