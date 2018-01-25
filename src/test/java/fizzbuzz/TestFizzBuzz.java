package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class TestFizzBuzz {

	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void testNumber() {
		Assert.assertEquals(fizzBuzz.evaluteFizzBuzzNumber(1), "1");
	}
}
