package com.imaginology.subjects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginology.subjects.dto.SubjectsDto;
import com.imaginology.subjects.entity.Subjects;
import com.imaginology.subjects.repository.SubjectsRepository;

@Service
public class SubjectsService {
	
	@Autowired
	SubjectsRepository subjectsRepository;
   
	public List<Subjects> createSubject(SubjectsDto subjectsDto){
		Subjects subjects= new Subjects();
		subjects.setSubjectname(subjectsDto.getSubjectname());
		subjects.setSubjectcode(subjectsDto.getSubjectcode());
		subjects.setSubjectteacher(subjectsDto.getSubjectteacher());
		subjectsRepository.save(subjects);
		List<Subjects> subject = subjectsRepository.findAll();
		return subject;
	}
	
	public List<Subjects> getAllSubjects(){
		return subjectsRepository.findAll();
	}
	
	public void deleteSubject(Long subjectcode) {
		subjectsRepository.deleteById(subjectcode);
	}
	
	public SubjectsDto getSubject(Long subjectcode) {
		Subjects subjects = subjectsRepository.getOne(subjectcode);
		SubjectsDto subjectsDto = new SubjectsDto();
		subjectsDto.setSubjectcode(subjects.getSubjectcode());
		subjectsDto.setSubjectname(subjects.getSubjectname());
		subjectsDto.setSubjectteacher(subjects.getSubjectteacher());
		return subjectsDto;
	}
}
