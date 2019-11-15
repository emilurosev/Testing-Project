package singidunum.projekat_testiranje;

import static org.junit.Assert.*;

import singidunum.projekat_testiranje.Igrac.Stanje;

import org.junit.Test;

public class OdbraniSeTest {
	
	Igrac i = new Igrac("Igrac", 0, 0, 0, 0, null, OruzjeStub.init(), OdecaStub.init(), MagijaStub.init());
	Igrac i2 = new Igrac("Igrac2", 0, 0, 0, 0, null, OruzjeStub.init2(), OdecaStub.init(), MagijaStub.init());
	
	
	@Test(expected=IllegalArgumentException.class)
	public void test0() {
		i.odbraniSe(-42);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test1() {
		i.odbraniSe(-1);
	}
	
	@Test
	public void test2() {
		i.setSnaga(25);
		i.setStanje(Stanje.AGRESIVNO);
		double expected = 0;
		double actual = i.odbraniSe(0);	
		assertEquals(expected, actual, 0);
	}
	@Test
	public void test3() {
		i.setSnaga(25);
		i.setStanje(Stanje.DEFANZIVNO);
		double expected = 0.22;
		double actual = i.odbraniSe(1);	
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void test4() {
		i.setSnaga(25);
		i.setStanje(Stanje.DEFANZIVNO);
		double expected = 17.77;
		double actual = i.odbraniSe(80);	
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void test5() {
		i.setSnaga(25);
		i.setStanje(Stanje.PASIVNO);
		double expected = 29.62;
		double actual = i.odbraniSe(80);	
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void test6() {
		i.setSnaga(25);
		i.setStanje(Stanje.AGRESIVNO);
		double expected = 55.55;
		double actual = i.odbraniSe(80);	
		assertEquals(expected, actual, 0.1);
	}
	
	// Zamenjeno je agresivno i defanzivno stanje u kodu
	@Test
	public void test7() {
		i2.setSnaga(25);
		i2.setStanje(Stanje.AGRESIVNO);
		double expected = 13.33;
		double actual = i2.odbraniSe(40);
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void test8() {
		i2.setSnaga(25);
		i2.setStanje(Stanje.PASIVNO);
		double expected = 6.66;
		double actual = i2.odbraniSe(40);
		assertEquals(expected, actual, 0.1);
	}
	
	
	// Zamenjeno je agresivno i defanzivno stanje u kodu
	@Test
	public void test9() {
		i2.setSnaga(25);
		i2.setStanje(Stanje.DEFANZIVNO);
		double expected = 4.44;
		double actual = i2.odbraniSe(40);
		assertEquals(expected, actual, 0.1);
	}
	
	
	// nije testiran slucaj kad je stanje u default slucaju jer nisam znao kako da ubacim novu vrednost u postojeci enum Stanje
	/*
	@Test(expected=IllegalStateException.class)
	public void test10() {
		i2.setSnaga(25);
		i2.setStanje(null);
		double expected = 4.44;
		double actual = i2.odbraniSe(40);    
		
		//assertEquals(expected, actual, 0.1);
	}
	*/

}
