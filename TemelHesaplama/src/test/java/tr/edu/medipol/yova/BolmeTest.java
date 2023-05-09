package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class BolmeTest {

	@Test
	public void testIslemYap() {
		int sonuc = Bolme.bolme(100,2);
		assertEquals(50, sonuc);
	}

}
