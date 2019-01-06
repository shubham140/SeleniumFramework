package com.qa.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//pojo - plain old java object
public class Users {

	String id;
	String name;
	String salary;
	String age;
	String profile_image;
	
	

	public Users() {

	}

	public Users(String name,String salary,String age) {
		this.name = name;
		this.salary=salary;
		this.age=age;
		
	}
	//getters and setters methods:


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


	
	

	
	
	
	
	
	
	

}
