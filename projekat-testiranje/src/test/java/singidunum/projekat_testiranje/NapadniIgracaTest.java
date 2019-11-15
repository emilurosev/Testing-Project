package singidunum.projekat_testiranje;

import static org.junit.Assert.*;

import org.junit.Test;
import singidunum.projekat_testiranje.Igrac.Stanje;

public class NapadniIgracaTest {
	
	Igrac i = new Igrac("Igrac", 0, 0, 0, 0, null, OruzjeStub.init(), OdecaStub.init(), MagijaStub.init());
	Igrac m = new Igrac("Meta", 100, 100, 50, 100, Stanje.DEFANZIVNO, OruzjeStub.init(), OdecaStub.init(), MagijaStub.init());
	

	
	@Test
	public void test0() {
		i.setEnergija(19);
		i.setSnaga(25);
		i.setStanje(Stanje.DEFANZIVNO);
		double expected = 40;
		double actual = i.napadniIgraca(0, m);
		assertEquals(expected, actual, 0);
	}
	
	// treba da stoji <= 20 umesto < u prvom if-u
	@Test
	public void test1() {
		i.setEnergija(20);
		i.setSnaga(25);
		i.setStanje(Stanje.DEFANZIVNO);
		double expected = 40;
		double actual = i.napadniIgraca(0, m);	
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void test2() {
		i.setEnergija(21);
		i.setSnaga(25);
		i.setStanje(Stanje.DEFANZIVNO);
		double expected = 56;
		double actual = i.napadniIgraca(0, m);
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test3() {
		i.setEnergija(21);
		i.setSnaga(19);
		i.setStanje(Stanje.DEFANZIVNO);
		double expected = 38.4;
		double actual = i.napadniIgraca(0, m);
		assertEquals(expected, actual, 0.1);
	}
	
	
	// treba da stoji < umesto <= u drugom if-u
	@Test
	public void test4() {
		i.setEnergija(21);
		i.setSnaga(20);
		i.setStanje(Stanje.DEFANZIVNO);
		double expected = 48;
		double actual = i.napadniIgraca(0, m);
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void test5() {
		i.setEnergija(21);
		i.setSnaga(21);
		i.setStanje(Stanje.DEFANZIVNO);
		double expected = 49.6;
		double actual = i.napadniIgraca(0, m);
		assertEquals(expected, actual, 0.1);
	}
	
	
	// krece white box
	@Test
	public void test7() {
		i.setEnergija(18);
		i.setSnaga(20);
		i.setStanje(Stanje.DEFANZIVNO);
		double expected = 32;
		double actual = i.napadniIgraca(0, m);
		assertEquals(expected, actual, 0);
	}
		
	
	//fali break
	@Test
	public void test8() {
		i.setEnergija(40);
		i.setSnaga(10);
		i.setStanje(Stanje.PASIVNO);
		double expected = 30;
		double actual = i.napadniIgraca(0, m);
		assertEquals(expected, actual, 0);
	}
	
	
	@Test
	public void test9() {
		i.setEnergija(40);
		i.setSnaga(30);
		i.setStanje(Stanje.AGRESIVNO);
		double expected = 96;
		double actual = i.napadniIgraca(0, m);
		assertEquals(expected, actual, 0);
	}

}