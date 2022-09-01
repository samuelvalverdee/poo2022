package yate.controller;

import yate.Admin;
import yate.gui.YateMainFrame;

public class YateMainFrameController {
	
	private YateMainFrame controlledFrame;
	private Admin admin;
	
	public YateMainFrameController(Admin pAdmin) {
		
		this.admin = pAdmin;

	}
	
	public void setWindow(YateMainFrame pFrame) {
		controlledFrame = pFrame;
	}
	
	public void cargarBateria() {
		
		this.admin.cargarBateria();
		
	}
}
