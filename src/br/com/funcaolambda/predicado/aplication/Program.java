package br.com.funcaolambda.predicado.aplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.funcaolambda.predicado.entities.Product;

public class Program {

public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
	
		double min = 100.0;
		
		list.removeIf((p) -> p.getPrice() >= min);
		
		list.forEach((item) -> {
			System.out.println(item);
		});
		
		
		
	}
}
