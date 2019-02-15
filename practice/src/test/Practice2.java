package test;




import static org.junit.Assert.assertEquals;

import org.junit.Test;

import squareroot.Square;

public class Practice2 {

	@Test
	public void add() {
		Square s1=new Square();
		assertEquals(8, s1.add(3,5));
	}

}
