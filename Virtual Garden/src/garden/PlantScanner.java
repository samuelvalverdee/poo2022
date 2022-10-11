package garden;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class PlantScanner {

	
	private JSONObject jsonObject;

	
	public PlantScanner() {
			
		JSONParser parser = new JSONParser();
		try {			
			this.jsonObject = (JSONObject) parser.parse(new FileReader("/Users/jcval/OneDrive/Documents/Samuel Valverde/TEC/II SEMESTRE - 2022/POO/Eclipse/Virtual Garden/src/garden/Planta.json"));
		}catch(Exception e) {
    		e.printStackTrace();
		}
		
	}	
	public ArrayList<ReadPlant> escaneoPlanta () {    
		
        JSONArray tipoPlantas =(JSONArray)jsonObject.get("Planta");
        ArrayList<ReadPlant> listaPlantas = new ArrayList<ReadPlant>();
        
        ArrayList<ArrayList<ArrayList<String>>> fotosArray = new ArrayList<ArrayList<ArrayList<String>>>();
        
        for (int i=0 ; i<tipoPlantas.size();i++)
        {
        	JSONObject PlantaJSON = (JSONObject) tipoPlantas.get(i);
        	
        	ReadPlant Planta = new ReadPlant();
        	
        	String nombrePlanta = (String) PlantaJSON.get("Nombre");
        	
        	ArrayList<Etapas> estadoArray = new ArrayList<Etapas>();
        	
        	ArrayList<ArrayList<String>> fotosPlanta = new ArrayList<ArrayList<String>>();
        	
        	JSONArray nivelPlanta = (JSONArray) PlantaJSON.get("Niveles");
        	
        	for (int f=0 ; f<nivelPlanta.size();f++)
        	{
				JSONObject niveles=(JSONObject) nivelPlanta.get(f);
				
				Etapas currentEtapa = new Etapas();
				
				ArrayList<String> fotosEtapa = new ArrayList<String>();
				
				String estadoStr=(String) niveles.get("etapa");
	    		String diasCrecer=(String) niveles.get("diasParaCrecer");
	    		
	    		String maxVidaStr=(String)niveles.get("MaxVida");
	    		String minVidaStr=(String)niveles.get("MinVida");
	    		
	    		String maxAguaStr=(String) niveles.get("MaxAgua");
	    		String minAguaStr=(String) niveles.get("MinAgua");
	    		
	    		String maxAbonoStr=(String) niveles.get("MaxAbono");
	    		String minAbonoStr=(String) niveles.get("MinAbono");
	    		
	    		String efectoAguaStr=(String) niveles.get("efectoAgua");
	    		String efectoAbonoStr=(String) niveles.get("efectoAbono");
	    		String efectoVidaStr=(String) niveles.get("efectoVida");
	    		
	    		String fotoEstado=(String) niveles.get("FotoEstado");
	    		String fotoHumedo=(String) niveles.get("CasoHumedo");
	    		String fotoSeco=(String) niveles.get("CasoSeco");
	    		String fotoMuerto=(String) niveles.get("CasoMuerto");
	    		
	    		int estado = Integer.parseInt(estadoStr);
	    		int diasPlanta = Integer.parseInt(diasCrecer);
	    		int vidaMin = Integer.parseInt(minVidaStr);
	    		int vidaMax = Integer.parseInt(maxVidaStr);
	    		int aguaMin = Integer.parseInt(minAguaStr);
        		int aguaMax = Integer.parseInt(maxAguaStr);
        		int abonoMin = Integer.parseInt(minAbonoStr);
        		int abonoMax = Integer.parseInt(maxAbonoStr);
        		int efectoAgua = Integer.parseInt(efectoAguaStr);
        		int efectoAbono = Integer.parseInt(efectoAbonoStr);
        		int efectoVida = Integer.parseInt(efectoVidaStr);
	    		
        		currentEtapa.setEtapa(estado);
        		currentEtapa.setDias(diasPlanta);
        		currentEtapa.setMinVida(vidaMin);
        		currentEtapa.setMaxVida(vidaMax);
        		currentEtapa.setMinAgua(aguaMin);
        		currentEtapa.setMaxAgua(aguaMax);
        		currentEtapa.setMinAbono(abonoMin);
        		currentEtapa.setMaxAbono(abonoMax);
        		currentEtapa.setEfectoAgua(efectoAgua);
        		currentEtapa.setEfectoAbono(efectoAbono);
        		currentEtapa.setEfectoVida(efectoVida);
        		
        		// fotosArray, fotosPlanta, fotosEtapa
        		
        		fotosEtapa.add(fotoEstado);
        		fotosEtapa.add(fotoHumedo);
        		fotosEtapa.add(fotoSeco);
        		fotosEtapa.add(fotoMuerto);
        		
        		fotosPlanta.add(fotosEtapa);		// se agregan las fotos de las tres etapas de la planta en un array
        		
        		currentEtapa.setFotos(fotosArray);
        		
        		estadoArray.add(currentEtapa);
        		
        		Planta.setNombre(nombrePlanta);
        		Planta.setEtapa(estadoArray);
        		
        		listaPlantas.add(Planta);
                
        	}
        	
        	
        // ESTACIONES / CLIMA
        
        JSONArray tipoEstaciones=(JSONArray)jsonObject.get("Estaciones");
	    
        for (int s=0 ; s<tipoEstaciones.size();s++)
        {
        	
    		JSONObject seasonType =(JSONObject) tipoEstaciones.get(s);
    		
    		ArrayList<Estaciones> estacionArray = new ArrayList<Estaciones>();
    		
    		Estaciones currentEstacion = new Estaciones();
    		
    		String estacionStr=(String) seasonType.get("Estacion");
    		String durationStr=(String) seasonType.get("DiasLimite");
    		String maxSolStr=(String) seasonType.get("MaxSun");
    		String minSolStr=(String) seasonType.get("MinSun");
    		String maxRainStr=(String) seasonType.get("MaxRain");
    		String minRainStr=(String) seasonType.get("MinRain");
    		
    		int estacion = Integer.parseInt(estacionStr);
    		int diasLimite = Integer.parseInt(durationStr);
    		int minSol = Integer.parseInt(minSolStr);
    		int maxSol = Integer.parseInt(maxSolStr);
    		int minRain = Integer.parseInt(minRainStr);
    		int maxRain = Integer.parseInt(maxRainStr);

    		currentEstacion.setEstacion(estacion);
    		currentEstacion.setDiasLimite(diasLimite);
    		currentEstacion.setMaxSol(maxSol);
    		currentEstacion.setMinSol(minSol);
    		currentEstacion.setMaxLluvia(maxRain);
    		currentEstacion.setMinLluvia(minRain);
    		
    		estacionArray.add(currentEstacion);
    		
    		Planta.setEstacion(estacionArray);
        	
        	}
        
        fotosArray.add(fotosPlanta);		// se agregan las fotos de las tres plantas en un array
        
        }
        
        return listaPlantas;
	
	}

}
