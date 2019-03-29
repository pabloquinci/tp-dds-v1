import java.awt.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.*;
public class Persona {
	
	private String nombrePersona;
	private int edad;
	private ArrayList<Prenda> sugerencia= new ArrayList<Prenda>();
	
	
	public Persona(String nombrePersona, int edad){
		this.nombrePersona=nombrePersona;
		this.edad=edad;
	}
	
	
	public String getNombrePersona() {
		return nombrePersona;
	}
	
	public ArrayList<Prenda> getPrendas(){
		return sugerencia;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public Boolean esSugerenciaValida() {
		Predicate<Prenda>p1= s->s.getClass().getName().equals("PrendaTorso");
		Predicate<Prenda>p2= s->s.getClass().getName().equals("PrendaPies");
		Predicate<Prenda>p3= s->s.getClass().getName().equals("PrendaPiernas");

		boolean tieneAlMenosUnaPrendaDeCadaTipo=sugerencia.stream().anyMatch(p1)&& 
												sugerencia.stream().anyMatch(p2)&& 
												sugerencia.stream().anyMatch(p3);
	
		return tieneAlMenosUnaPrendaDeCadaTipo;
	}

}
