package br.com.interfacesfuncionais;

import java.util.function.Supplier;

public class Suplidores {
	
	public static void main(String[] args) {
		//não recebe parâmetros e retorna ele mesmo
		Supplier<Pessoa> suppliers = () -> new Pessoa();
		
		System.out.println(suppliers.get());
	}
	
}

class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() {
		this.nome = "João"; 
		this.idade = 23;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	
		
}
