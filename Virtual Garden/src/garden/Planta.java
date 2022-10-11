package garden;

import java.util.ArrayList;

public class Planta {

	private int vida;
	
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
	//*************************
	private int estacion;
	private int diasLimite;
	private int maxSol;
	private int minSol;
	private int maxLluvia;
	private int minLluvia;
	
	public Planta(int pVida, int maxAgua) {
		this.vida = pVida;
	}
	
	public Planta(ArrayList<ReadPlant> planta) {
		 
		this.vida = 50;
		
	}

	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
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

	public int getEstacion() {
		return estacion;
	}

	public void setEstacion(int estacion) {
		this.estacion = estacion;
	}

	public int getDiasLimite() {
		return diasLimite;
	}

	public void setDiasLimite(int diasLimite) {
		this.diasLimite = diasLimite;
	}

	public int getMaxSol() {
		return maxSol;
	}

	public void setMaxSol(int maxSol) {
		this.maxSol = maxSol;
	}

	public int getMinSol() {
		return minSol;
	}

	public void setMinSol(int minSol) {
		this.minSol = minSol;
	}

	public int getMaxLluvia() {
		return maxLluvia;
	}

	public void setMaxLluvia(int maxLluvia) {
		this.maxLluvia = maxLluvia;
	}

	public int getMinLluvia() {
		return minLluvia;
	}

	public void setMinLluvia(int minLluvia) {
		this.minLluvia = minLluvia;
	}
	
}
