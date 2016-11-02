package cooksys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cooksys.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
