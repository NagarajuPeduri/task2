package calculateCost;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class constructionTest {
	
	calculateCost obj = new calculateCost();

	@Test
	void testCalc() {
		assertEquals(150000, obj.calculate("above standard materials", 100, "Not fully automated"));
		assertEquals(6250000, obj.calculate("high standard materials", 2500, "Fully Automated Home"));
		assertEquals(3750000, obj.calculate("above standard materials", 2500, "Fully Automated Home"));
		assertEquals(3750000, obj.calculate("above standard materials", 2500, "Not Fully Automated Home"));	
	}
}
