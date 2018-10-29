package se;

import java.util.Scanner;

public class student {

	public String name;
	public int age;
	public String DOB;
	public int ID;
	public String username;
	public String modules;
	
	
	public student (String name, int age, String DOB) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
	}
	
	public String toString(){
        String str = "Student Name: " + this.name + " Age: " + this.age + " Date of birth: " + this.DOB + " Student ID: " + this.ID;
        return str;
    }
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getUsername() {
		this.username = this.name + this.age;
		return this.username;
	}
	
}
