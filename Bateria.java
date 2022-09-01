package yate;

import java.lang.reflect.Array;

public class Bateria {
	
	private int nivelCarga;
	
	public Bateria() {
	
		this.nivelCarga = Constants.cargaInicial;
		//this.cargarBateria(nivelCarga, Constants.speed, Constants.hora);
	}
	
	public void cargarBateria(int carga, int vel[], int pHoras[]){
	
		if(carga==100);
			System.out.println("La bateria esta cargada.");
		
		for (int i = 0; i < 3; i++) {
			
            int x = (int)Array.get(pHoras, i);
            if(x==12){
            	if(vel[i]==25);
            		carga += 25;
            	if(vel[i]==50);
            		carga += 20;
            	if(vel[i]==75);
            		carga += 15;
			}
            if(x==16){
	            if(vel[i]==25);
	    			carga += 20;
		    	if(vel[i]==50);
		    		carga += 15;
		    	if(vel[i]==75);
		    		carga += 10;
            }
		    else {
		    	if(vel[i]==25);
	    			carga += 10;
		    	if(vel[i]==50);
		    		carga += 5;
		    	if(vel[i]==75);
		    		carga += 0;
		    	
		    }
		    	
		    	

	}

}
}