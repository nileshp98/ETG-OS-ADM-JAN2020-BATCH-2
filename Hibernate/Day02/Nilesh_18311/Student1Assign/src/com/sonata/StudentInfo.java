package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="getStudentInfo.byId" ,query = "from StudentInfo where StdId =?")
@NamedNativeQuery(name="getStudentInfo.byName", query = "select * from StudentInfo",resultClass=StudentInfo.class )
public class StudentInfo {
	@Id
	private int StdId;
	private String StdName;
	private int Marks;
	public int getStdId() {
		return StdId;
	}
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	
	

}
