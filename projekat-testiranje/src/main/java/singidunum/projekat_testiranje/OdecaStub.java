package singidunum.projekat_testiranje;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class OdecaStub {
	public static ArrayList<Odeca> init() {
		ArrayList<Odeca> svaOdeca = new ArrayList<Odeca>();
		Odeca o1 = mock(Odeca.class);
		Odeca o2 = mock(Odeca.class);
		Odeca o3 = mock(Odeca.class);
		
		when(o1.getOdbrambenaVrednost()).thenReturn(5.0);
		when(o1.getTezina()).thenReturn(10.0);
		
		when(o2.getOdbrambenaVrednost()).thenReturn(10.0);
		when(o2.getTezina()).thenReturn(15.0);
		
		when(o3.getOdbrambenaVrednost()).thenReturn(15.0);
		when(o3.getTezina()).thenReturn(20.0);
		
		svaOdeca.add(o1);
		svaOdeca.add(o2);
		svaOdeca.add(o3);
		
		return svaOdeca;
	}

}
