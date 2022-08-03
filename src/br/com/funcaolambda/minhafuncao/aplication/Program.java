package br.com.funcaolambda.minhafuncao.aplication;

import java.util.ArrayList;
import java.util.List;

import br.com.funcaolambda.minhafuncao.entities.Product;
import br.com.funcaolambda.minhafuncao.services.ProductService;



public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filterredSun(list, (p) -> {
			return p.getName().charAt(0) == 'T';
		});
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}
}
