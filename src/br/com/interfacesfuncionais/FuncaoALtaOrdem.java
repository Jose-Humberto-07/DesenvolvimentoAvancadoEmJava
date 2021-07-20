package br.com.interfacesfuncionais;

public class FuncaoALtaOrdem {
	
	public static void main(String[] args) {
		Calculo somar = (n1, n2) -> n1 + n2;
		Calculo subtrair = (n1, n2) -> n1 - n2;
		Calculo multiplicar = (n1, n2) -> n1 * n2;
		Calculo dividir = (n1, n2) -> n1 / n2;

		System.out.println(executarOperacao(somar, 10, 110));
		System.out.println(executarOperacao(subtrair, 10, 110));
		System.out.println(executarOperacao(multiplicar, 10, 110));
		System.out.println(executarOperacao(dividir, 110, 10));
		
		System.out.println(somar.calcular(10, 10));
	}
	
	public static int executarOperacao(Calculo somar, int n1, int n2) {
		return somar.calcular(n1, n2);
	}
	
}


interface Calculo {
	public int calcular(int n1, int n2);
}
