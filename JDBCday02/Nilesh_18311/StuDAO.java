package com.sonata.DAO;

import java.util.List;

import com.sonata.Model.Student;
import com.sonata.StdDAOImpl.DuplicateException;


public interface StuDAO {
	public int addStudent(Object obj) throws DuplicateException;
	public List<Student> getStudent();

}
