import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calculatorTest {

	calculator obj = new calculator();
	
	@Test
	void calculatorTest()		//constructor
	{
		
		assertEquals(5, obj.add(3,  2));
		assertEquals(10, obj.multiply(5,  2));
		assertEquals(5, obj.modulo(5, 7));
		Assertions.assertThrows(ArithmeticException.class,()->obj.divide(25, 0));
	}
	
	@Test
	void test2() {
		assertEquals(2, obj.divide(10, 5));
	}

}
