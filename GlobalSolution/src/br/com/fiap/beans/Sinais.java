package br.com.fiap.beans;

public class Sinais {
	//Variavies
	private String humor;
	private int pas;
	private int pad;
	private int glicemia;
	private double temp;
	private int sat;
	private int fc;
	
	//metodo construtor vazio 
	public Sinais() {
		super();
	}
   //metodo construtor cheio  
	public Sinais(String humor, int pas, int pad, int glicemia, double temp, int sat, int fc) {
		super();
		this.humor = humor;
		this.pas = pas;
		this.pad = pad;
		this.glicemia = glicemia;
		this.temp = temp;
		this.sat = sat;
		this.fc = fc;
		
   // getters and setters		
	}
	public String getHumor() {
		return humor;
	}
	public void setHumor(String humor) {
		this.humor = humor;
	}
	public int getPas() {
		return pas;
	}
	public void setPas(int pas) {
		this.pas = pas;
	}
	public int getPad() {
		return pad;
	}
	public void setPad(int pad) {
		this.pad = pad;
	}
	public int getGlicemia() {
		return glicemia;
	}
	public void setGlicemia(int glicemia) {
		this.glicemia = glicemia;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public int getSat() {
		return sat;
	}
	public void setSat(int sat) {
		this.sat = sat;
	}
	public int getFc() {
		return fc;
	}
	public void setFc(int fc) {
		this.fc = fc;
	}
	
	
	
	
	
	

}
