package nz.ac.massey;

import static org.junit.Assert.*;
import org.junit.Test;

import nz.ac.massey.Calc;

public class TestCalc{
	@Test
	public void testAssert(){
		Calc c = new Calc();
		assertEquals( c.add(1,1), 2 );
	}

}
