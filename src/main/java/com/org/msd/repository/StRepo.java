package com.org.msd.repository;

import com.org.msd.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StRepo extends JpaRepository<Student,Integer> {
}
