package br.com.funcaolambda.function.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import br.com.funcaolambda.function.entities.Product;

public class Program {

public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
	
		Function<Product, String> function = (p) -> {
			return p.getName().toUpperCase();
		};
		
		List<String> names = list.stream().map((p) -> {
			return p.getName().toUpperCase();
		}).collect(Collectors.toList());
		
		// linha // List<String> names = list.stream().map((p) -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		// List<String> names = list.stream().map((p) -> {
		//return p.getName().toUpperCase();
		//}).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		names.forEach((name) -> {
			System.out.println(name);
		});
		
		
	}
}
