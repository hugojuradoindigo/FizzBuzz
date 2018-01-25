package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class TestFizzBuzz {

	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void testNumber() {
		Assert.assertEquals("1", fizzBuzz.evaluteFizzBuzzNumber(1));
	}
	
	@Test
	public void testMultiple3() {
	    Assert.assertEquals("fizz", fizzBuzz.evaluteFizzBuzzNumber(3));
	}
}
