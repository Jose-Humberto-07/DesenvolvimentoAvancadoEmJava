package br.com.generics.delemiters.application;

import br.com.generics.delemiters.entities.Client;

public class HashCodeEEquals {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		String c = "maria";
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
	}
}
