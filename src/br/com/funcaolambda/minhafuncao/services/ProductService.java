package br.com.funcaolambda.minhafuncao.services;

import java.util.List;
import java.util.function.Predicate;

import br.com.funcaolambda.minhafuncao.entities.Product;

public class ProductService {

	public double filterredSun(List<Product> list, Predicate<Product> criterio) {
		double sum = 0.0;
		for (Product p : list) {
			if (criterio.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
