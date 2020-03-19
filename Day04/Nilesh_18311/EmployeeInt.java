package com.sonata.EmployeeApplication;

import java.util.LinkedList;

public interface EmployeeInt {
public void addEmployee(LinkedList ls);   
public void deleteEmployee(LinkedList ls,Employee emp);
public void ObjectreadEmployee(LinkedList<Employee> ls);
public double yearSalary(Employee e1);
public double appSalary(Employee e1);



}
