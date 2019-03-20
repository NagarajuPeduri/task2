package compountAndSimple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class interestTests {

	interestCal obj = new interestCal();
	
	@Test
	void test() {
		assertEquals(100000, obj.compound(100000,  5,  4));
		assertEquals(850000, obj.compound(850000, 6, 10));
		assertEquals(20000, obj.simpleInterest(100000,  5,  4));
		assertEquals(456000, obj.simpleInterest(950000,  4,  12));
	}

}
