package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {
     @Test
     public void testToplaNegatifVePozitifSayi() {
    	 int sayi1 = -99;
    	 int sayi2 = 100;
    	 int gercekSonuc = Toplama.topla(sayi1, sayi2);
    	 assertEquals(1,gercekSonuc);
    	 
     }
	

}
