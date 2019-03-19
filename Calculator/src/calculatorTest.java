import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	void calculatorTest()		//constructor
	{
		calculator obj = new calculator();
		assertEquals(5, obj.add(3,  2));
		assertEquals(10, obj.multiply(5,  2));
		assertEquals(5, obj.modulo(5, 7));
	}

}
