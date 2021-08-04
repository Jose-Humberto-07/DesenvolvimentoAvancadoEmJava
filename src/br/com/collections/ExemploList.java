package br.com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ExemploList {
	
	//Lista
	
	public static void main(String[] args) {
		List<String> listaJogadores = new ArrayList<>();
		
		listaJogadores.add("Neymar Jnr");
		listaJogadores.add("Cristiano Ronaldo");
		listaJogadores.add(("Lionel Messi"));
		listaJogadores.add("Iniesta");
		listaJogadores.add("Xavi");
		listaJogadores.add("Mbappe");
		listaJogadores.add("Di maria");
		
		System.out.println(listaJogadores);	
		
		Collections.sort(listaJogadores);
		
		System.out.println(listaJogadores);
		
		listaJogadores.remove(1);
		
		listaJogadores.set(5, "Pogba");
		
		System.out.println(listaJogadores);
		
		System.out.println(listaJogadores.get(5));
		
		int tamanhoSize = listaJogadores.size();
		System.out.println(tamanhoSize);
		
		listaJogadores.remove("Mbappe");
		
		System.out.println(listaJogadores);
		
		System.out.println(listaJogadores.contains("Neymar Jnr"));
		System.out.println(listaJogadores.contains("pepe"));
		System.out.println(listaJogadores.isEmpty());
		
		System.out.println(listaJogadores.indexOf("Lionel Messi"));
		
		
		listaJogadores.stream()
		.forEach(nome -> System.out.println(nome));
		
	}
}
