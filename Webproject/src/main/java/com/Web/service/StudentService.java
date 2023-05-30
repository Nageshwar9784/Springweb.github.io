package com.Web.service;

import java.util.List;

import com.Web.entity.Student;

public interface StudentService {
	List<Student> getAllStudent();
	Student saveStudent(Student student);
}
