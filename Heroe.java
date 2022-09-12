package quiz4y5;

public abstract class Heroe implements Interface {
	
	private String nombreS;
	private String poderS;
	private String habilidadesS;
	private String origen;
	
	public void setNombre(String pNombre) {
		this.nombreS = pNombre;
	}
	
	public void setPoder(String pPoder) {
		this.poderS = pPoder;
	}
	
	public void setHabilidades(String pHabilidades) {
		this.habilidadesS = pHabilidades;
	}
	
	public void setOrigen(String pOrigen) {
		this.origen = pOrigen;
		
	}
}
