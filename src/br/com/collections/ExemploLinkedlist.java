package br.com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedlist {
	public static void main(String[] args) {
		//fila (O primeiro a entrar ser� o primeiro a sair)
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Pamela");
		filaBanco.add("Patr�cia");
		filaBanco.add("Roberto");
		filaBanco.add("Fl�vio");
		filaBanco.add("Anderson");
		
		System.out.println(filaBanco);
		
		//poll retorna e remove o primeiro da fila (fila vazia retorna null)
		String clienteAserAntendido = filaBanco.poll();
		
		System.out.println(clienteAserAntendido);
		
		System.out.println(filaBanco);
		
		//peek retorna e n�o remove o primeiro da fila (fila vazia retorna null)
		String primeiroCliente = filaBanco.peek();
		
		System.out.println(primeiroCliente);
		
		System.out.println(filaBanco);
		//filaBanco.clear();
		//element retonrna o primeiro da fila e n�o retorna nada, se a fila estiver vazia, lan�a uma exeption
		String primeiroClienteOuErro = filaBanco.element();
		System.out.println(primeiroClienteOuErro);
		
		System.out.println(filaBanco);
		
		for (String cliente: filaBanco) {
			System.out.println(cliente);
		}
		
		Iterator<String> iteratorFilaBanco = filaBanco.iterator();
		
		while (iteratorFilaBanco.hasNext()) {
			System.out.println("---> " + iteratorFilaBanco.next());
		}
		
		System.out.println(filaBanco.size());
		
		System.out.println(filaBanco.isEmpty());
	}
}
