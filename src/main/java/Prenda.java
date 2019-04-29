
public class Prenda {

	private String nombrePrenda;
	private TipoPrenda tipo;
	private int temperaturaUso;

	public Prenda(String nombrePrenda, TipoPrenda tipo, int temperaturaUso) {
		this.nombrePrenda=nombrePrenda;
		this.tipo=tipo;
		this.temperaturaUso=temperaturaUso;

	}
	
	public Prenda() {
		
	}


	public String getNombrePrenda() {
		
		return nombrePrenda;
	}
	
	public int getTemperatura() {
		return temperaturaUso;
	}
}
