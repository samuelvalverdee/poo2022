package garden;

import java.util.ArrayList;

public class Etapas {

	private int etapa;
	private int dias;

	private int maxAgua;
	private int minAgua;
	private int maxAbono;
	private int minAbono;
	private int maxVida;
	private int minVida;

	private int efectoAgua;
	private int efectoAbono;
	private int efectoVida;

	private ArrayList<?> Fotos;

	public Etapas () {
		
	
		
	}
	
	
	public int getEtapa() {
		return etapa;
	}
	public void setEtapa(int etapa) {
		this.etapa = etapa;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public int getMaxAgua() {
		return maxAgua;
	}
	public void setMaxAgua(int maxAgua) {
		this.maxAgua = maxAgua;
	}
	public int getMinAgua() {
		return minAgua;
	}
	public void setMinAgua(int minAgua) {
		this.minAgua = minAgua;
	}
	public int getMaxAbono() {
		return maxAbono;
	}
	public void setMaxAbono(int maxAbono) {
		this.maxAbono = maxAbono;
	}
	public int getMinAbono() {
		return minAbono;
	}
	public void setMinAbono(int minAbono) {
		this.minAbono = minAbono;
	}
	public int getMaxVida() {
		return maxVida;
	}
	public void setMaxVida(int maxVida) {
		this.maxVida = maxVida;
	}
	public int getMinVida() {
		return minVida;
	}
	public void setMinVida(int minVida) {
		this.minVida = minVida;
	}
	public int getEfectoAgua() {
		return efectoAgua;
	}
	public void setEfectoAgua(int efectoAgua) {
		this.efectoAgua = efectoAgua;
	}
	public int getEfectoAbono() {
		return efectoAbono;
	}
	public void setEfectoAbono(int efectoAbono) {
		this.efectoAbono = efectoAbono;
	}
	public int getEfectoVida() {
		return efectoVida;
	}
	public void setEfectoVida(int efectoVida) {
		this.efectoVida = efectoVida;
	}

	public ArrayList<?> getFotos() {
		return Fotos;
	}

	public void setFotos(ArrayList<?> fotos) {
		Fotos = fotos;
	}
	
	
	
}




