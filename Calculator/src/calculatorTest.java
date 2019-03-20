import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calculatorTest {

	calculator obj = new calculator();
	
	
	@Test
	void addTest() {
		assertEquals(2, obj.add(0, 2));
		assertEquals(100, obj.add(25,  75));
	}
	
	@Test
	void subTest() {
		assertEquals(-10, obj.sub(10,  20));
		assertEquals(5, obj.sub(10,  5));
	}

	@Test
	void multiplyTest() {
		assertEquals(10, obj.multiply(2, 5));
		assertEquals(100, obj.multiply(10,  10));
		assertEquals(-40, obj.multiply(10,-4));
		assertEquals(-25, obj.multiply(5,-5));
	}
	 
	@Test
	void divideTest() {
		assertEquals(10.0, obj.divide(50,5));
		assertEquals(50.0, obj.divide(100, 2));
		Assertions.assertThrows(ArithmeticException.class, ()->obj.divide(1, 0));
	}
	
	@Test
	void moduloTest() {
		assertEquals(5, obj.modulo(5,  7));
		assertEquals(0, obj.modulo(100,  2));
		assertEquals(2, obj.modulo(27,  5));
	}
	
}
