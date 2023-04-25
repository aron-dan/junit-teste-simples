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
		Assertions.assertEquals(resultado, calculadora.Soma(resultado, 0));
	}

	@Test
	public void testeSubtracao() {
<<<<<<< HEAD
		//Arrange
		Calculadora calculadora = new Calculadora();

		//ACT
		double result = calculadora.Subtracao(20, 30);

		//Assert
		Assertions.assertEquals(result, calculadora.Subtracao(result, result));
=======
		// ACT
		double result = calculadora.Subtracao(20, 30);

		// Assert
		Assertions.assertEquals(result, calculadora.Subtracao(result, 0));
>>>>>>> 247c4c5 (correção da variavel result)
	}

	@Test
	public void TesteMultiplicacao() {
		// ACT
		double result = calculadora.Multiplicacao(20, 30);

		// Assert
		Assertions.assertEquals(result, calculadora.Multiplicacao(result, 1));
	}

	@Test
	public void testeDivisao() {
<<<<<<< HEAD
		//Arrange
		Calculadora calculadora = new Calculadora();

		//ACT
		double result = calculadora.Divisao(20, 30);

		//Assert
		Assertions.assertEquals(result, calculadora.Divisao(result, result));
=======
		// ACT
		double result = calculadora.Divisao(20, 30);

		// Assert
		Assertions.assertEquals(result, calculadora.Divisao(result, 1));
>>>>>>> 247c4c5 (correção da variavel result)
	}

	@Test
	public void testePotencia() {
<<<<<<< HEAD
		//Arrange
		Calculadora calculadora = new Calculadora();

		//ACT
		double result = calculadora.Potenciacao(20, 30);

		//Assert
		Assertions.assertEquals(result, calculadora.Potenciacao(result, result));
=======
		// ACT
		double result = calculadora.Potenciacao(20, 30);

		// Assert
		Assertions.assertEquals(result, calculadora.Potenciacao(result, 1));
>>>>>>> 247c4c5 (correção da variavel result)
	}

}
