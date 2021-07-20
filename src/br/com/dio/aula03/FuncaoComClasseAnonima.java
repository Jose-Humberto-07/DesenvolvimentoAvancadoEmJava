package br.com.dio.aula03;

public class FuncaoComClasseAnonima {
	
	public static void main(String[] args) {
		Funcao colocarPrefixoSenhoNaString = new Funcao() {
			@Override
			public String gerar(String valor) {
				
				return "Sr. " + valor;
			}
		};
		
		System.out.println(colocarPrefixoSenhoNaString.gerar("Humberto"));
	}
}
