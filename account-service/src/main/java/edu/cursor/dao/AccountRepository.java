package edu.cursor.dao;

import com.okta.developer.docker_microservices.service.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
