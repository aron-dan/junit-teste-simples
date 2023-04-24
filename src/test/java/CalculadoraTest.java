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
		double resultado = calculadora.Soma(10,10);
		
		//Assert
		Assertions.assertEquals(resultado, calculadora.Soma(resultado, 0));
	}
	
	public void testeSubtracao() {
		//Arrange
		Calculadora calculadora = new Calculadora();

		//ACT
		double result = calculadora.Subtracao(20, 30);

		//Assert
		Assertions.assertEquals(result, calculadora.Subtracao(result, result));
	}
	
	public void testeDivisao() {
		//Arrange
		Calculadora calculadora = new Calculadora();

		//ACT
		double result = calculadora.Divisao(20, 30);

		//Assert
		Assertions.assertEquals(result, calculadora.Divisao(result, result));
	}
	
	public void testePotencia() {
		//Arrange
		Calculadora calculadora = new Calculadora();

		//ACT
		double result = calculadora.Potenciacao(20, 30);

		//Assert
		Assertions.assertEquals(result, calculadora.Potenciacao(result, result));
	}
	

}
