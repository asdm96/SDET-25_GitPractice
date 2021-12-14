package DemoPractice;

import org.junit.Test;
import org.testng.xml.XmlTest;

public class Parameter {
	
	@Test
	public void demo(XmlTest xml) {
		
		System.out.println(xml.getParameter("browser"));
	}

}
