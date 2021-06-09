package ex4.util;
/*
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser
 *  comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos
 *  dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor
 *  em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
 */
public class Conversor {

	public static final double IOF = 0.011;

	public static double Converter (double precoDolar, double qtdeDolares) {
		double total = precoDolar * qtdeDolares;
		return total + (total * IOF);
	}
}