import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrecoTest {

	@Test
	void test() {
		GrecoClass g=new GrecoClass();
		assertEquals(2187, g.cognomeMet(3, 7));
	}
	
	@Test
	void test1() {
		GrecoClass g=new GrecoClass();
		assertEquals(0, g.cognomeMet(0, 1));
	}

	
	@Test
	void test2() {
		GrecoClass g=new GrecoClass();
		assertEquals(1, g.cognomeMet(0, 0));
	}



}
