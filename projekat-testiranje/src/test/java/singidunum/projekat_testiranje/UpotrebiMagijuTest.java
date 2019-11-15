package singidunum.projekat_testiranje;

import static org.junit.Assert.*;

import org.junit.Test;

import singidunum.projekat_testiranje.Igrac.Stanje;

public class UpotrebiMagijuTest {
	
	Igrac i = new Igrac("Igrac", 0, 0, 0, 0, Stanje.PASIVNO, OruzjeStub.init(), OdecaStub.init(), MagijaStub.init());
	Igrac m = new Igrac("Meta", 100, 100, 50, 0, Stanje.DEFANZIVNO, OruzjeStub.init(), OdecaStub.init(), MagijaStub.init());
	
	@Test
	public void test0() {
		i.setInteligencija(24);
		i.setEnergija(50);
		
		double expected = 0;
		double actual = i.upotrebiMagiju(0, m);
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test1() {
		i.setInteligencija(25);
		i.setEnergija(50);
		m.setInteligencija(20);
		double expected = 37.5;
		double actual = i.upotrebiMagiju(0, m);
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test2() {
		i.setZdravlje(100);
		i.setInteligencija(26);
		i.setEnergija(20);
		m.setInteligencija(20);
		double expected = 48;
		double actual = i.upotrebiMagiju(0, m);
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test3() {
		i.setZdravlje(100);
		i.setInteligencija(24);
		i.setEnergija(30);
		m.setInteligencija(20);
		i.upotrebiMagiju(0, m);
		double expected = 70;
		double actual = i.getZdravlje();
		assertEquals(expected, actual, 0);
	}

	
	
	// krece whitebox
	
	@Test
	public void test4() {
		i.setZdravlje(100);
		i.setInteligencija(30);
		i.setEnergija(50);
		m.setInteligencija(20);
		double expected = 90;
		double actual = i.upotrebiMagiju(0, m);
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test5() {
		i.setZdravlje(100);
		i.setInteligencija(30);
		i.setEnergija(15);
		m.setInteligencija(20);
		double expected = 90;
		double actual = i.upotrebiMagiju(0, m);
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test6() {
		i.setZdravlje(3);
		i.setInteligencija(22);
		i.setEnergija(15);
		m.setInteligencija(20);
		double expected = 0;
		double actual = i.upotrebiMagiju(0, m);
		assertEquals(expected, actual, 0);
	}
	
	


}
