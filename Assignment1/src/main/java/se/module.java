package se;

import java.util.ArrayList;

public class module {

	public String modName;
	public String modID;
	public String listStudents;
	public String courses;
	
	public module (String modName, String modID) {
		this.modName = modName;
		this.modID = modID;
		
	}
	
    private ArrayList<student> students = new ArrayList<student>();

	public String toString(){
        String str = "Module Name: " + this.modName + " Module ID: " + this.modID + "\n";
        for (student s : students){
            str += "\t" + s + "\n";
        }
        return str;
    }
	
	
	public String getmodName() {
		return modName;
	}
	
	public void setmodName(String modName) {
		this.modName = modName;
	}
	
	public String getmodID() {
		return modID;
	}
	
	public void setmodID(String modID) {
		this.modID = modID;
	}
	
	public ArrayList<student>getstudents(){
		return getstudents();
	}
	
	public void addStudent(student s) {
		students.add(s);
	}
	
	public void setstudents(ArrayList<student> students) {
		this.students = students;
	}
}
