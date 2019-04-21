import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testPrendas {

	@Test
	public void testValido() {
		
		Persona persona1=new Persona("Pablo",28);
		PrendaPies prendaPies1=new PrendaPies("Zapatos Gamuza", TipoPrenda.PIES);
		PrendaTorso prendaTorso1=new PrendaTorso("Remera QuickSilver", TipoPrenda.TORSO);
		PrendaPiernas prendaPierna1=new PrendaPiernas("Pantalon Levis", TipoPrenda.PIERNA);
		Accesorio accesorio1=new Accesorio("Pulsera", TipoPrenda.ACCESORIO);


		persona1.getPrendas().add(prendaPies1);
		persona1.getPrendas().add(prendaTorso1);
		persona1.getPrendas().add(prendaPierna1);
		persona1.getPrendas().add(accesorio1);


		Assert.assertEquals(true, persona1.esSugerenciaValida());

	}
	@Test
	public void testInvalido() {
		Persona persona2=new Persona("Pablo",28);
		PrendaPies prendaPies2=new PrendaPies("Zapatos Gamuza", TipoPrenda.PIES);
		PrendaPiernas prendaPierna2=new PrendaPiernas("Pantalon Levis", TipoPrenda.PIERNA);
		Accesorio accesorio1=new Accesorio("Pulsera", TipoPrenda.ACCESORIO);


		persona2.getPrendas().add(prendaPies2);
		persona2.getPrendas().add(prendaPierna2);
		persona2.getPrendas().add(accesorio1);
		
		Assert.assertEquals(true, persona2.esSugerenciaValida());

		
	}

}
