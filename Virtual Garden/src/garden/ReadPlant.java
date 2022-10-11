package garden;

import java.util.ArrayList;

public class ReadPlant {

	private String nombre;
	private ArrayList<Etapas> etapa;
	private ArrayList<Estaciones> estacion;
	
	public ReadPlant() {
		
	}
	
	// Getters & Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Etapa
	public ArrayList<Etapas> getEtapa() {
		return etapa;
	}

	public void setEtapa(ArrayList<Etapas> etapa) {
		this.etapa = etapa;
	}
	
	// Estacion
	public ArrayList<Estaciones> getEstacion() {
		return estacion;
	}

	public void setEstacion(ArrayList<Estaciones> estacion) {
		this.estacion = estacion;
	}
	
}
