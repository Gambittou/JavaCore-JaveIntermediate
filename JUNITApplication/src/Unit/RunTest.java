package Unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunTest {
	
	public void runFindBig() {
		
		assertEquals(200,Calculator.findBig(100, 200));
	}
	
	public void runFindSmall() {
		
		assertEquals(10, Calculator.findSmall(10, 20));
	}

}
