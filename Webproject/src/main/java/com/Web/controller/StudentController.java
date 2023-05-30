package com.Web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Web.entity.Student;
import com.Web.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService ss;

	public StudentController(StudentService ss) {
		super();
		this.ss = ss;
	}
	
	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("students", ss.getAllStudent());
		return "viewinfo";
	}
	@GetMapping("/students/new")
	public String createStudent(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		return "createStudent";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		ss.saveStudent(student);
		return "redirect:/students";
	}
	
}
