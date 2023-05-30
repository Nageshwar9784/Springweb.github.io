package com.Web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Web.entity.Student;

public interface StudentReprository extends JpaRepository<Student, Long> {

}
