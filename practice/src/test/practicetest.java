package test;




import static org.junit.Assert.assertEquals;

import org.junit.Test;

import squareroot.Square;

public class practicetest {


	@Test
	public void squaretest() {
		Square s=new Square();
		int result=s.square(5);
		
		
		assertEquals(25, result);	
	}

}
