package br.com.collections;

import java.util.TreeSet;

public class ExemploTreeSet {
	//árvore binária
	
	// não é muito bom, porque é ordenado novamente após uma modificação
	public static void main(String[] args) {
		
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		//Monta a árvore com as capitais
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florionópolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		// retorna a primeira capital no topo da árvore
		System.out.println(treeCapitais.first());
		
		// retorna a última capital no final da árvore
		System.out.println(treeCapitais.last());
		
		//retorna a primeira capital abaixo na árvore parametizada
		System.out.println(treeCapitais.lower("Florionópolis"));
		
		//retorna a primeira capital acima na árvore da capital parametizada
		System.out.println(treeCapitais.higher("Florionópolis"));
		
		//retorna a primeira capital no topo da árvore, removendo do set
		System.out.println(treeCapitais.pollFirst());
		
		//retorna a primeira capital no final da árvore, removendo do set
		System.out.println(treeCapitais.pollLast());
		
	}
}
