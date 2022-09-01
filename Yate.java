package yate;

import yate.controller.YateMainFrameController;
import yate.gui.YateMainFrame;

// Tres niveles de intensidad solar: High(3), Medium(2), Low(1)
// High: 10h - 15h; Medium: 6h-10h, 15h - 18h; Low: 18h - 6h


public class Yate {

	public static void main(String[] args) {
		
		Admin viaje = new Admin();
		
		viaje.crearBaterias();
		viaje.crearPaneles();
		
		YateMainFrameController controller = new YateMainFrameController(viaje);
		
		YateMainFrame yateW = new YateMainFrame("SilentYacht", controller);
		
	}

}
