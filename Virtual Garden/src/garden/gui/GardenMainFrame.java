package garden.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

import garden.controller.GardenMainController;
import garden.Constants;

public class GardenMainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private GardenMainController controller;

	public GardenMainFrame(String pTitle, GardenMainController pController){
		
		super(pTitle);
		controller = pController;
		controller.setWindow(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(180, 180, 1080, 780);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setBackground(Color.lightGray);
		this.initComponents();
		
		this.setVisible(true);
	}
	
	private void initComponents() {
		
	}
	
}
