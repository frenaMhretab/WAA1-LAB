package edu.miu.demo.repository;
import edu.miu.demo.domain.ApplicationLogger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationLoggerRepository extends JpaRepository<ApplicationLogger,Long> {

}
