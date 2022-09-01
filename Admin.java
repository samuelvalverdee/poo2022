package yate;

import java.util.ArrayList;

public class Admin {
	
	private int baterias = Constants.baterias;
	private int paneles = Constants.paneles;
	private int i;
	private int j;
	private ArrayList <Integer> horas = new ArrayList <Integer>();
	
	public void crearBaterias() {
		
		for(i=1;i<=baterias;i++) {
			
			Bateria bateria = new Bateria();
			bateria.cargarBateria(bateria.nivelCarga(), Constants.speed, Constants.hora);
	}
}
	
	public void crearPaneles() {
		
		for(j=1;j<=paneles;j++) {
			
			Panel panel = new Panel();
			panel.
			
		}
	}
	
	public void energia(){
		
		
		
	}

}

	
