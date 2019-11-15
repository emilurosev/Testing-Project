package singidunum.projekat_testiranje;

import static org.junit.Assert.*;

import org.junit.Test;

public class OdmoriSeTest {
	Igrac i = new Igrac("Igrac", 0, 0, 0, 0, null, OruzjeStub.init(), OdecaStub.init(), MagijaStub.init());

	
	@Test
	public void test0() {
		i.setEnergija(92);
		double expected = 0;
		double actual = i.odmoriSe();
		assertEquals(expected, actual, 0);
	}
	
	
	// stoji 500 umesto 50
	@Test
	public void test1() {
		i.setEnergija(23);
		double expected = 50;
		double actual = i.odmoriSe();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test2() {
		i.setEnergija(74);
		double expected = 26;
		double actual = i.odmoriSe();
		assertEquals(expected, actual, 0);
	}
	
	//treba da stoji <= 75 a stoji <
	@Test
	public void test3() {
		i.setEnergija(75);
		double expected = 25;
		double actual = i.odmoriSe();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test4() {
		i.setEnergija(76);
		double expected = 0;
		double actual = i.odmoriSe();
		assertEquals(expected, actual, 0);
	}
	
	
	// white box tests
	@Test
	public void test5() {
		i.setEnergija(30);
		double expected = 70;
		double actual = i.odmoriSe();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test6() {
		i.setEnergija(-401);
		double expected = 50;
		double actual = i.odmoriSe();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void test7() {
		i.setEnergija(80);
		double expected = 0;
		double actual = i.odmoriSe();
		assertEquals(expected, actual, 0);
	}
	

}
