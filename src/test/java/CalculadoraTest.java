import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calculadora = new Calculadora();

	@Test
	public void testeSoma() {
		// Act
		double resultado = calculadora.Soma(10, 10);

		// Assert
		Assertions.assertEquals(resultado, calculadora.Soma(10, 10));
	}

	@Test
	public void testeSubtracao() {
		// ACT
		double result = calculadora.Subtracao(20, 30);

		// Assert
		Assertions.assertEquals(result, calculadora.Subtracao(20, 30));
	}

	@Test
	public void TesteMultiplicacao() {
		// ACT
		double result = calculadora.Multiplicacao(20, 30);

		// Assert
		Assertions.assertEquals(result, calculadora.Multiplicacao(20, 30));
	}

	@Test
	public void testeDivisao() {
		// ACT
		double result = calculadora.Divisao(20, 30);

		// Assert
		Assertions.assertEquals(result, calculadora.Divisao(20, 30));
	}

	@Test
	public void testePotencia() {
		// ACT
		double result = calculadora.Potenciacao(20, 30);

		// Assert
		Assertions.assertEquals(result, calculadora.Potenciacao(20, 30));
	}

}
