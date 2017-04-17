package com.junit.model;

public class Calculo {
	private float valor1;
	private float valor2;
	private float resultado;
	
	public float getValor1() {
		return valor1;
	}
	public void setValor1(float valor1) {
		this.valor1 = valor1;
	}
	public float getValor2() {
		return valor2;
	}
	public void setValor2(float valor2) {
		this.valor2 = valor2;
	}
	
	public float getResultado() {
		return resultado;
	}
	
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	public float somaValores(float valor1, float valor2){
		return valor1 + valor2;
	}
	
	public float subtraiValores(float valor1, float valor2){
		return valor1 - valor2;
	}
	
	public float multiplicaValores(float valor1, float valor2){
		return valor1 * valor2;
	}
	
	public float divideValores(float valor1, float valor2){
		return valor1 / valor2;
	}
}
