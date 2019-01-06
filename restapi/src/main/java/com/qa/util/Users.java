package com.qa.util;

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
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}

	
	

	
	

}
