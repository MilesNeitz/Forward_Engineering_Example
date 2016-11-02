package cooksys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cooksys.entity.Skill;

public interface SkillRepo extends JpaRepository<Skill, Long>{

}
