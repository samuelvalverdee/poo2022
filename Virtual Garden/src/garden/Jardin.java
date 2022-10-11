package garden;

import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;

public class Jardin {

	public static ArrayList<ReadPlant> listaPlantas;
	
	public static void main(String[] args) throws IOException {
		
		mostrarMenu();
		//listaPlantas = plantaScan.escaneoPlanta();						// listaPlantas
		
		//Simulator sim = new Simulation();
		
	}
	
	public static void mostrarMenu() throws IOException {
		
		Scanner input = new Scanner (System.in);
        int opcion = -1;
        
        do{
            System.out.println("**** Virtual Garden ****");
            System.out.println("1. Jugar.");
            System.out.println("0. Salir");
            
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(input.next());
            
            procesarOpcion(opcion);
            
        }while(opcion !=0);
    }
        
    public static void procesarOpcion(int opcion) throws IOException{
		switch(opcion){
		    case 1:
		        jugar();
		        break;
		    case 0:
		        System.out.println("Gracias por su visita!!");
		        break;
		    default:
                System.out.println("Opción invalida!");
                break;
            }
        }
    
    public static void jugar() {
    	
    	PlantScanner plantaScan = new PlantScanner();

		ArrayList<ReadPlant> scannedPlants = plantaScan.escaneoPlanta();
		
		Scanner input = new Scanner (System.in);
        int opcion = -1;
        
        do{
            System.out.println("\n\n**** Plantas Disponibles ****");
            System.out.println("0. Apio.");
            System.out.println("1. Cactus");
            System.out.println("2. Girasol.");
            System.out.println("3. Salir");
            
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(input.next());
            
            ReadPlant newPlant = new ReadPlant();
            
            newPlant = scannedPlants.get(opcion);
            
            System.out.println(newPlant.getNombre());
            
            listaPlantas.add(newPlant);						// plantas del jardin
         
        }while(opcion !=3);
		
    }

}
