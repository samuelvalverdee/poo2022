package quiz6;

import java.util.ArrayList;
import java.util.Collections;

public class MainQuiz {

	public static void main(String[] args) {
		
		ArrayList<Participante> participantes = new ArrayList<Participante>();
		
		participantes.add(new Participante("Jimena",(int)(Math.random()*5)+7,(int)(Math.random()*10)+7));
		participantes.add(new Participante("Isaac",(int)(Math.random()*5)+7,(int)(Math.random()*10)+7));
		participantes.add(new Participante("Jose Daniel",(int)(Math.random()*5)+7,(int)(Math.random()*10)+7));
		participantes.add(new Participante("Camila",(int)(Math.random()*5)+7,(int)(Math.random()*10)+7));
		participantes.add(new Participante("Santiago",(int)(Math.random()*5)+7,(int)(Math.random()*10)+7));
		participantes.add(new Participante("Nicole",(int)(Math.random()*5)+7,(int)(Math.random()*10)+7));
		participantes.add(new Participante("Samuel",(int)(Math.random()*5)+7,(int)(Math.random()*10)+7));
		
		Collections.sort(participantes);
		
		System.out.println("Nombre          Juegos     Puntos");
		System.out.println("---------------------------------");
		
		for(Participante pt : participantes) {
			System.out.println(pt.getNombre()+"        "+pt.getJuegos()+"   -   "+pt.getPuntos());
		}
	}
}