package simulation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import garden.StatusManager;
import garden.Constants;

public class Simulator implements Runnable, Constants{

	private LocalTime tiempo;
	private StatusManager plantManager;
	private int currentSun;
	private int currentRain;
	private LocalTime lastWeatherCheck;
	private boolean running = false;
	private int dias;
	
	public Simulator(StatusManager pManager) {
		this.plantManager = pManager;
	}
	
	@Override
	public void run() {
		
		tiempo = LocalTime.now();
		LocalDate currentTime;
		running = true;
		while(running) {
			try {
				System.out.println("Han pasado "+dias+" dias");
				
				Thread.sleep(CHECKIN);
				dias = (int)ChronoUnit.MILLIS.between(tiempo, LocalTime.now()) / DAY_IN_MILLIS;
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	
	}
	
	/*public void updateWeather(int pSol, int pRain) {
		
		
		
	}*/

	public void stop() {
		running = false;
	}
	
}
