package se;

import org.joda.time.DateTime;
import org.junit.Test;

public class test {

	private student s;
	private DateTime d;
	
	public test() {
		d = new DateTime();
		s = new student ("lois", 22, "24/10/1995");
	}
	public void hey() {
		String username = s.getUsername();
	}
}
