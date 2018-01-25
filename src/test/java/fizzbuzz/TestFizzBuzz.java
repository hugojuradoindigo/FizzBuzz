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
	
	@Test
	public void testMultiple5() {
	    Assert.assertEquals("buzz", fizzBuzz.evaluteFizzBuzzNumber(5));
	}
	
	@Test
    public void testMultiple3Y5() {
        Assert.assertEquals("fizzbuzz", fizzBuzz.evaluteFizzBuzzNumber(15));
    }
}
