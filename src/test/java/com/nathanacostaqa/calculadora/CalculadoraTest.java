package com.nathanacostaqa.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Testes Unitários da classe Calculadora utilizando o framework JUnit 5.8.1
 */
public class CalculadoraTest {
    static Calculadora calculadora;

    @BeforeAll
    public static void inicializa(){
        calculadora = new Calculadora();
    }

    @DisplayName("Valida soma dos números 5 e 3")
    @Test
    public void validarSoma(){
        Assertions.assertEquals(8.0, calculadora.somar(5.0,3.0));
    }

    @DisplayName("Valida subtração dos números 4 e 2")
    @Test
    public void validarSubtracao(){
       Assertions.assertEquals(2.0, calculadora.subtrair(4.0,2.0));
    }

    @DisplayName("Valida multiplicação dos números 3 e 4")
    @Test
    public void validarMultiplicacao(){
        Assertions.assertEquals(12.0, calculadora.multiplicar(3.0,4.0));
    }

    @DisplayName("Valida divisão entre os números 10 e 2")
    @Test
    public void validarDivisao(){
        Assertions.assertEquals(5.0, calculadora.dividir(10.0, 2.0));
    }

    @DisplayName("Valida múltiplas subtrações com informações em um arquivo CSV")
    @ParameterizedTest
    @CsvSource({ "50.0, 40.0, 10.0", "25.0, 10.0, 15.0"})
    void validarMultiplasSubtracoesCSV (double primeiroValor, double segundoValor, double resultadoEsperado){
        Assertions.assertEquals(resultadoEsperado,calculadora.subtrair(primeiroValor, segundoValor));
    }
}
