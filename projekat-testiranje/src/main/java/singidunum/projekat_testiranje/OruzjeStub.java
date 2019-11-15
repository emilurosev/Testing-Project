package singidunum.projekat_testiranje;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class OruzjeStub {
	public static ArrayList<Oruzje> init() {
		Oruzje mac = mock(Oruzje.class);
		Oruzje sekira = mock(Oruzje.class);
		Oruzje buzdovan = mock(Oruzje.class);
		
		
		when(mac.getSteta()).thenReturn((double) 20);
		when(mac.getPotrebnaSnaga()).thenReturn(20.0);
		when(mac.getTezina()).thenReturn(15.0);
		
		when(sekira.getSteta()).thenReturn((double) 25);
		when(sekira.getPotrebnaSnaga()).thenReturn(25.0);
		when(sekira.getTezina()).thenReturn(20.0);
		
		when(buzdovan.getSteta()).thenReturn((double) 35);
		when(buzdovan.getPotrebnaSnaga()).thenReturn(30.0);
		when(buzdovan.getTezina()).thenReturn(30.0);
		
		
		ArrayList<Oruzje> svaOruzja = new ArrayList<Oruzje>();
		svaOruzja.add(mac);
		svaOruzja.add(sekira);
		svaOruzja.add(buzdovan);
		
		return svaOruzja;
		
	}
	
	public static ArrayList<Oruzje> init2() {
		Oruzje noz = mock(Oruzje.class);
		Oruzje luk = mock(Oruzje.class);
		
		
		
		when(noz.getSteta()).thenReturn(5.0);
		when(noz.getPotrebnaSnaga()).thenReturn(4.0);
		when(noz.getTezina()).thenReturn(5.0);
		
		when(luk.getSteta()).thenReturn(10.0);
		when(luk.getPotrebnaSnaga()).thenReturn(7.5);
		when(luk.getTezina()).thenReturn(9.0);
		
	
		
		ArrayList<Oruzje> svaOruzja = new ArrayList<Oruzje>();
		svaOruzja.add(noz);
		svaOruzja.add(luk);
		
		return svaOruzja;
		
	}
	
	
}
