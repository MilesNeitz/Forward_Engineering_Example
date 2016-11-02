package cooksys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import cooksys.entity.Skill;
import cooksys.entity.Student;
import cooksys.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	StudentService studentService;
	
	public StudentController(StudentService service) {
		this.studentService = service;
	}
	
	@GetMapping("/{student}")
	public Student get(@PathVariable Student student) {
		return student;
	}
	
	@PostMapping
	public void add(@RequestBody Student student) {
		studentService.add(student);
	}
	
	@PutMapping("/{student}/skill/{skill}")
	public void addSkill(@PathVariable Student student, @PathVariable Skill skill) {
		studentService.addSkill(student, skill);
	}
	
	
	
}
