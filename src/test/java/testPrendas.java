import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testPrendas {

	@Test
	public void testCombinacionSinAccesorio() {
		//EL CRITERIO DE LA PRENDA ES TEMPERATURA >20 PARA SER CONSIDERADA DENTRO DE LA COMBINACION
		Persona persona1=new Persona("Pablo",28);
		PrendaPies prendaPies1=new PrendaPies("Zapatos Gamuza", TipoPrenda.PIES,25);
		PrendaTorso prendaTorso1=new PrendaTorso("Remera QuickSilver", TipoPrenda.TORSO,22);
		PrendaPiernas prendaPierna1=new PrendaPiernas("Pantalon Levis", TipoPrenda.PIERNA,28);
		Accesorio accesorio1=new Accesorio("Pulsera", TipoPrenda.ACCESORIO,18);
		
		Guardaropa guardaropa=new Guardaropa(Criterio.TEMPERATURA);

		persona1.setGuardaropa(guardaropa);

		persona1.getGuardaropa().getPrendas().add(prendaPies1);
		persona1.getGuardaropa().getPrendas().add(prendaTorso1);
		persona1.getGuardaropa().getPrendas().add(prendaPierna1);
		persona1.getGuardaropa().getPrendas().add(accesorio1);
		
		persona1.getGuardaropa().generaCombinacion();
				
		Assert.assertEquals(true, persona1.getGuardaropa().esSugerenciaValida());


	}
	
	@Test
	public void testCombinacionInvalidaPorFaltaDeUnTipoDePrenda() {
		//EL CRITERIO DE LA PRENDA ES TEMPERATURA >20 PARA SER CONSIDERADA DENTRO DE LA COMBINACION
		Persona persona1=new Persona("Pablo",28);
		PrendaPies prendaPies1=new PrendaPies("Zapatos Gamuza", TipoPrenda.PIES,25);
		PrendaTorso prendaTorso1=new PrendaTorso("Remera QuickSilver", TipoPrenda.TORSO,18);
		PrendaPiernas prendaPierna1=new PrendaPiernas("Pantalon Levis", TipoPrenda.PIERNA,28);
		Accesorio accesorio1=new Accesorio("Pulsera", TipoPrenda.ACCESORIO,18);
		
		Guardaropa guardaropa=new Guardaropa(Criterio.TEMPERATURA);

		persona1.setGuardaropa(guardaropa);

		persona1.getGuardaropa().getPrendas().add(prendaPies1);
		persona1.getGuardaropa().getPrendas().add(prendaTorso1);
		persona1.getGuardaropa().getPrendas().add(prendaPierna1);
		persona1.getGuardaropa().getPrendas().add(accesorio1);
		
		persona1.getGuardaropa().generaCombinacion();
				
		Assert.assertEquals(false, persona1.getGuardaropa().esSugerenciaValida());


	}
	@Test
	public void testCombinacionInvalidaPorAccesorio() {
		
		Persona persona1=new Persona("Pablo",28);
		PrendaPies prendaPies1=new PrendaPies("Zapatos Gamuza", TipoPrenda.PIES,25);
		PrendaTorso prendaTorso1=new PrendaTorso("Remera QuickSilver", TipoPrenda.TORSO,22);
		PrendaPiernas prendaPierna1=new PrendaPiernas("Pantalon Levis", TipoPrenda.PIERNA,28);
		Accesorio accesorio1=new Accesorio("Pulsera", TipoPrenda.ACCESORIO,30);
		
		Guardaropa guardaropa=new Guardaropa(Criterio.TEMPERATURA);

		persona1.setGuardaropa(guardaropa);

		persona1.getGuardaropa().getPrendas().add(prendaPies1);
		persona1.getGuardaropa().getPrendas().add(prendaTorso1);
		persona1.getGuardaropa().getPrendas().add(prendaPierna1);
		persona1.getGuardaropa().getPrendas().add(accesorio1);
		
		persona1.getGuardaropa().generaCombinacion();//La sugerencia es invalida por el accesorio
				
		Assert.assertEquals(false, persona1.getGuardaropa().esSugerenciaValida());


	}

}
