package quiz6;

public class Participante implements Comparable<Participante>{
	
	private String nombre;
	private int juegos;
	private int puntos;
	
	public Participante(String pNombre, int pJuegos, int pPuntos) {
		this.nombre = pNombre;
		this.juegos = pJuegos;
		this.puntos = pPuntos;
	}
	// getters
	public String getNombre() {
		return nombre;
	}

	public int getJuegos() {
		return juegos;
	}

	public int getPuntos() {
		return puntos;
	}
	//@Override
	public int compareTo(Participante pt) {
		
		 if(this.juegos > pt.juegos)    
			 return 1;    
		else if(this.juegos < pt.juegos)    
			 return -1;    
		else {
			if(this.puntos > pt.puntos) {
				return -1;
			}
			else if(this.puntos < pt.puntos) {
				return 1;
			}
			else {
				return 0;
			}
		}    
			 
	}
	
	
}
