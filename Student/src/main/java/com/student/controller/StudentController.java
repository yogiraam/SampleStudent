package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.exceptions.ResourceNotFoundException;
import com.student.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	 private StudentService studentService;
	@GetMapping("/getAll")
	private List<Student> getAll()
	{
		return studentService.getAllStudents();
	}
	@PostMapping("/add")
	private Student add(@RequestBody Student student)
	{
		 return studentService.addStudent(student);
	}
	@PutMapping("/update")
	private Student update(@RequestBody Student student) throws ResourceNotFoundException
	{
		return studentService.updateStudent(student);
	}
	@DeleteMapping("/delete")
	private String delete(@PathVariable int stid) throws ResourceNotFoundException
	{
		return studentService.deleteStudent(stid);
		
	}

}
