package com.imaginology.subjects.dto;

import java.io.Serializable;

public class SubjectsDto implements Serializable {
	private String subjectname;
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
