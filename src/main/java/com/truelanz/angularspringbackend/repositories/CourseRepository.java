package com.truelanz.angularspringbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.truelanz.angularspringbackend.entities.*;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
