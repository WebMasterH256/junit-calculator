package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MethodTest {
	
	private Methods m;
	
	//todo A anotação @BeforeEach é um método que é iniciado antes de quaisquer testes. Geralmente é usado para manter um objeto intacto a cada teste.
	@BeforeEach
	void setUp() {
		m = new Methods();
		System.out.println("Teste inicializado...");
	}
	
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
	
	@Test
	void testMultiplicar() {
		double nA = 1.5;
		double nB = 2.0;
		
		double resultado = m.multiplicar(nA, nB);
		
		assertEquals(3.0, resultado, 0.01);
	}
	
	@Test
	void testDividir() {
		double nA = 10.0;
		double nB = 2.0;
		
		double resultado = m.dividir(nA, nB);
		
		assertEquals(5, resultado, 0.01);
	}
	
	@Test
	void testNull() {
		//todo Há um teste específico para null
		assertNull(m.dividir(1, 0));
	}
}
