package com.imaginology.subjects.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects implements Serializable {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String subjectname;
	@Id
	private Long subjectcode;
	private String subjectteacher;
	
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public Long getSubjectcode() {
		return subjectcode;
	}
	public void setSubjectcode(Long subjectcode) {
		this.subjectcode = subjectcode;
	}
	public String getSubjectteacher() {
		return subjectteacher;
	}
	public void setSubjectteacher(String subjectteacher) {
		this.subjectteacher = subjectteacher;
	}

}
