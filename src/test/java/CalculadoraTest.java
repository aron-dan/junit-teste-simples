import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	 public void testeSoma() {
		//Arrange
		Calculadora calculadora = new Calculadora();
		
		//Act
		int resultado = calculadora.Soma(10, 5);
		
		Assertions.assertEquals(15, resultado);
	}
	
	public void testeSubtracao() {
		Calculadora calculadora = new Calculadora();
		
		Assertions.assertEquals(0, calculadora.Subtracao());
	}
	
	public void testeDivisao() {
		Calculadora calculadora = new Calculadora();
		
		Assertions.assertEquals(1, calculadora.Divisao());
	}
	
	public void testePotencia() {
		Calculadora calculadora = new Calculadora();
		
		Assertions.assertEquals(20, calculadora.Potenciacao());
	}
	

}
