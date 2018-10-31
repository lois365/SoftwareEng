package se;

import static org.junit.Assert.*;
import org.junit.Test;


public class test {
	
	
	public void testGetUserName() {
		student student = new student("lois", 22, "24/10/1995");
		String expected = student.getUsername();
		assertEquals(expected, "lois22");	
	}

	private void assertEquals(String expected, String string) {
		// TODO Auto-generated method stub
		
	}


}