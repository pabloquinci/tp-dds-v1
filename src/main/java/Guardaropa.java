
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;
public class Guardaropa {

	private List<Prenda> prendas = new ArrayList<Prenda>();
	private List<Prenda> sugerencia= new ArrayList<Prenda>();
	Criterio criterio;


	public Guardaropa(Criterio criterio) {
		this.criterio=criterio;
	}
	
	public List<Prenda> generaCombinacion() {
				
		sugerencia=prendas.stream().filter(x->esPrendaValida(x)).collect(Collectors.toList());
		return sugerencia;
	}
	public boolean esPrendaValida(Prenda prenda) {
		if(criterio==Criterio.TEMPERATURA) {
			if(prenda.getTemperatura()<=20) {
				return false;
			}else return true;
		}
		return false;
	}
	
	public Boolean esSugerenciaValida() {
		Predicate<Prenda> p1 = s -> s.getClass().getName().equals("PrendaTorso");
		Predicate<Prenda> p2 = s -> s.getClass().getName().equals("PrendaPies");
		Predicate<Prenda> p3 = s -> s.getClass().getName().equals("PrendaPiernas");
		Predicate<Prenda> p4 = s -> s.getClass().getName().equals("Accesorio");


		boolean tieneAlMenosUnaPrendaDeCadaTipo = sugerencia.stream().anyMatch(p1) && sugerencia.stream().anyMatch(p2)
				&& sugerencia.stream().anyMatch(p3) && !(sugerencia.stream().anyMatch(p4));

		return tieneAlMenosUnaPrendaDeCadaTipo;
	}
	
	public List<Prenda> getSugerencia(){
		
		return sugerencia;
	}
	
	public List<Prenda> getPrendas(){
		
		return prendas;
	}

}