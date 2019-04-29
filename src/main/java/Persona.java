import java.awt.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.*;
public class Persona {
	
	private String nombrePersona;
	private int edad;
	private Guardaropa guardaropa;
	
	public Persona(String nombrePersona, int edad){
		this.nombrePersona=nombrePersona;
		this.edad=edad;
	}
	
	
	public String getNombrePersona() {
		return nombrePersona;
	}
	
	public Guardaropa getGuardaropa(){
		return guardaropa;
	}
	
	public void setGuardaropa(Guardaropa guardaropa){
		this.guardaropa=guardaropa;
	}

	
	public int getEdad() {
		return edad;
	}
	


}
