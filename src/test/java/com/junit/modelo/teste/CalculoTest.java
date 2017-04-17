package com.junit.modelo.teste;

import com.junit.model.Calculo;

import junit.framework.TestCase;

public class CalculoTest extends TestCase {
	public void testSomaValores(){
		float valor1 = 10;
		float valor2 = 5;
		float resultadoEsperado = 50;
		
		Calculo auxCalculo = new Calculo();
		
		//float resultadoObtido = auxCalculo.somaValores(valor1, valor2);
		//float resultadoObtido = auxCalculo.subtraiValores(valor1, valor2);
		float resultadoObtido = auxCalculo.multiplicaValores(valor1, valor2);
		//float resultadoObtido = auxCalculo.divideValores(valor1, valor2);
		
		assertEquals(resultadoEsperado, resultadoObtido, 0);
	}
}