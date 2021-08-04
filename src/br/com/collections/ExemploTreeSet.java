package br.com.collections;

import java.util.TreeSet;

public class ExemploTreeSet {
	//�rvore bin�ria
	
	// n�o � muito bom, porque � ordenado novamente ap�s uma modifica��o
	public static void main(String[] args) {
		
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		//Monta a �rvore com as capitais
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florion�polis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("S�o Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		// retorna a primeira capital no topo da �rvore
		System.out.println(treeCapitais.first());
		
		// retorna a �ltima capital no final da �rvore
		System.out.println(treeCapitais.last());
		
		//retorna a primeira capital abaixo na �rvore parametizada
		System.out.println(treeCapitais.lower("Florion�polis"));
		
		//retorna a primeira capital acima na �rvore da capital parametizada
		System.out.println(treeCapitais.higher("Florion�polis"));
		
		//retorna a primeira capital no topo da �rvore, removendo do set
		System.out.println(treeCapitais.pollFirst());
		
		//retorna a primeira capital no final da �rvore, removendo do set
		System.out.println(treeCapitais.pollLast());
		
	}
}
