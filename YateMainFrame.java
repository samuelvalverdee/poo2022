package yate.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import yate.controller.YateMainFrameController;
import yate.Constants;

public class YateMainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private YateMainFrameController controller;
	
	public YateMainFrame(String pTitle, YateMainFrameController pController) {
		
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
		
		
		JLabel tagBateria = new JLabel("Bateria 1");
		tagBateria.setBounds(10, 20, 160, 20);
		this.add(tagBateria);
		
		JTextField txtBateria = new JTextField();
		txtBateria.setBounds(230, 20, 160, 20);
		this.add(txtBateria);
		
		JLabel tagPanel = new JLabel("Panel 1");
		tagPanel.setBounds(10, 80, 160, 20);
		this.add(tagPanel);
		
		JTextField txtPanel = new JTextField();
		txtPanel.setBounds(230, 80, 160, 20);
		this.add(txtPanel);
		
		JButton btnStart = new JButton("Iniciar simulacion");
		btnStart.setBounds(280, 72, 100, 20);
		btnStart.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// controller.
			}
		});
		
		JButton btnStop = new JButton("Detener simulacion");
		btnStop.setBounds(280, 72, 100, 20);
		btnStop.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// controller.
			}
		});
		
	}
}
