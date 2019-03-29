import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testPrendas {

	@Test
	public void test() {
		
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

}
