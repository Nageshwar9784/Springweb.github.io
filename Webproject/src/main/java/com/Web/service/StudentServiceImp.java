package com.Web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Web.entity.Student;
import com.Web.repository.StudentReprository;
@Service
public  class StudentServiceImp implements StudentService {
	
	StudentReprository srepo;
	
	public StudentServiceImp(StudentReprository srepo) {
		super();
		this.srepo = srepo;
	}

	public List<Student> getAllStudent(){
		return srepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return srepo.save(student);
	}
}
