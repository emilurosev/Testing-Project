package singidunum.projekat_testiranje;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class MagijaStub {
	public static ArrayList<Magija> init() {
		ArrayList<Magija> sveMagije = new ArrayList<Magija>();
		
		Magija m1 = mock(Magija.class);
		Magija m2 = mock(Magija.class);
		Magija m3 = mock(Magija.class);
		
		
		when(m1.getSteta()).thenReturn(5.0);
		when(m1.getPotrebnaInteligencija()).thenReturn(25.0);
		when(m1.getPotrebnaEnergija()).thenReturn(20.0);
		
		
		when(m2.getSteta()).thenReturn(10.0);
		when(m2.getPotrebnaInteligencija()).thenReturn(30.0);
		when(m2.getPotrebnaEnergija()).thenReturn(25.0);
		
		when(m3.getSteta()).thenReturn(15.0);
		when(m3.getPotrebnaInteligencija()).thenReturn(35.0);
		when(m3.getPotrebnaEnergija()).thenReturn(30.0);
		
		sveMagije.add(m1);
		sveMagije.add(m2);
		sveMagije.add(m3);
		
		
		
		return sveMagije;
		
	}
	

}
