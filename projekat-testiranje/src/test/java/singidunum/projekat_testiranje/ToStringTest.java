package singidunum.projekat_testiranje;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToStringTest {

	Igrac i = new Igrac("Igrac", 99, 35, 50, 50, null, OruzjeStub.init(), OdecaStub.init(), MagijaStub.init());
	
	@Test
	public void test() {
		String expected = "(" + i.getNaziv() + ", " + i.getZdravlje() + "/" + i.getEnergija() + 
				", STR:" + i.getSnaga() + ", INT:" + i.getInteligencija() + ")";
		String actual = i.toString();
		assertEquals(expected, actual);
	}

}
