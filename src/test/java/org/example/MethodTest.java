package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodTest {
	
	Methods m = new Methods();
	
	//todo Para indicar que um método é um teste, usa-se a anotação @Test
	@Test
  void testSomar() {
		//todo 1. PREPARAR (Arrange): Instanciamos a classe e escolhemos os números
		double nA = 2.0;
		double nB = 3.0;
		
		//todo 2. AGIR (Act): Pedimos para o método trabalhar e guardamos o que ele devolve
		double resultado = m.somar(nA, nB);
		
		//todo 3. VERIFICAR (Assert): Checamos se a resposta bate com o nosso gabarito
		
		assertEquals(5.0, resultado, 0.01);
	}
	
	@Test
	void testSubtrair() {
		// 1. PREPARAR (Arrange)
		double nA = 10.0;
		double nB =  3.0;
		
		// 2. AGIR (Act)
		double resultado = m.subtrair(nA, nB);
		
		// 3. VERIFICAR (Assert)
		assertEquals(7.0, resultado, 0.01);
	}
}
