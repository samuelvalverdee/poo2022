package garden.controller;

import garden.Jardin;
import garden.gui.GardenMainFrame;

public class GardenMainController {

	private GardenMainFrame controlledFrame;
	private Jardin jardin;
	
	public GardenMainController(Jardin pJardin) {
		
		this.jardin = pJardin;
	
	}
		
	public void setWindow(GardenMainFrame pFrame) {
		controlledFrame = pFrame;	
	
	}

}
