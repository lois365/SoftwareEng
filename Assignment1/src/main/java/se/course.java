package se;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class course {
	
	private String courseName;
	private String listOfStudents;
    private ArrayList<module> modules = new ArrayList();
    private DateTime startDate;
    private DateTime endDate;


public course(String courseName, DateTime startDate, DateTime endDate) {
	this.courseName = courseName;
	this.startDate = startDate;
	this.endDate = endDate;
}

public String toString(){
    String str = "Course programme Name: " + this.courseName + " Start date: " + this.startDate + " End Date: " + this.endDate + "\n";
	for (module m : modules){
        str += " \t" + m + "\n";
    }
    return str;
}

public String getcourseName() {
	return courseName;
}

public void setcourseName(String courseName) {
	this.courseName = courseName;
}

public ArrayList<module> getmodules(){
	return modules;
}

public void addmodule (module m) {
	modules.add(m);
}

public DateTime getstartDate() {
	return startDate;
}

public void setstartDate(DateTime startDate) {
	this.startDate = startDate;
}

public DateTime getendDate() {
	return endDate;
}

public void setendDate(DateTime endDate) {
	this.endDate = endDate;
}

public void setmodule(ArrayList<module> modules) {
    this.modules = modules;
	}	
}
