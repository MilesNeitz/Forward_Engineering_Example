package cooksys.service;

import org.springframework.stereotype.Service;

import cooksys.entity.Skill;
import cooksys.entity.Student;
import cooksys.repository.SkillRepo;
import cooksys.repository.StudentRepo;

@Service
public class StudentService {
	
	private StudentRepo studentRepo;
	private SkillRepo skillRepo;

	public StudentService(StudentRepo studentRepo, SkillRepo skillRepo) {
		this.studentRepo = studentRepo;
		this.skillRepo = skillRepo;
	}
	
	public void addSkill(Student student, Skill skill) {
		student.getSkills().add(skill);
		studentRepo.saveAndFlush(student);
	}
	
	public Student get(Long id) {
		return studentRepo.getOne(id);
	}

	public void add(Student student) {
		studentRepo.saveAndFlush(student);
	}
	
}
