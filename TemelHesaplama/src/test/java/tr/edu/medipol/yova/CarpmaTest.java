package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarpmaTest {

	@Test
	public void testIslemYap() {
		int sonuc = Carpma.carp(10,5);
		assertEquals(50, sonuc);
	}

}
