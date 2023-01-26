package br.com.willian.math;

public class SimpleMath {
	public double soma( double numeroUm, double numeroDois) {
		return numeroUm + numeroDois;
	}
	public double subtracao( double numeroUm, double numeroDois) {
		return numeroUm - numeroDois;
	}
	public double multiplicacao( double numeroUm, double numeroDois) {
		return numeroUm * numeroDois;
	}
	public double divisao( double numeroUm, double numeroDois) {
		return numeroUm / numeroDois;
	}
	public double media( double numeroUm, double numeroDois) {
		return (numeroUm + numeroDois) / 2;
	}
	public double raiz( double numero) {
		return Math.sqrt(numero);
	}
}
