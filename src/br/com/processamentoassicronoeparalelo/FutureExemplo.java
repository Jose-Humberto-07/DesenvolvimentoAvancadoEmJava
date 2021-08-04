package br.com.processamentoassicronoeparalelo;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.List;

public class FutureExemplo {

}


class Casa {
	private List<Comodo> comodos;

	public Casa(List<Comodo> comodos) {
		this.comodos = comodos;
	}

	List<Atividade> obterAfazeresDaCasa() {
		return null;
			
	}
	
}

interface Atividade {
	void realizar();
}

abstract class Comodo {
	abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo{

	@Override
	List<Atividade> obterAfazeresDoComodo() {
		
		return null;
	}

}