package com.nathanacostaqa.calculadora;

/**
 *  Calculadora que executa quatro operações básicas (soma, subtração, divisão e multiplicação)
 *
 *  Nathana Costa QA - 2021
 */
public class Calculadora
{
    public double somar (double primeiroNumero, double segundoNumero){
        double resultadoSoma = primeiroNumero + segundoNumero;
        return resultadoSoma;
    }

    public double subtrair(double primeiroValor, double segundoValor){
        double resultadoSubtracao = primeiroValor - segundoValor;
        return resultadoSubtracao;
    }

    public double dividir (double dividendo, double divisor){
        double resultadoDivisao = dividendo / divisor;
        return resultadoDivisao;
    }

    public double multiplicar (double primeiroValor, double segundoValor){
        double resultadoMultiplicacao = primeiroValor * segundoValor;
        return resultadoMultiplicacao;
    }
}
