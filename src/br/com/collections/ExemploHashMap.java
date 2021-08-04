package br.com.collections;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
	public static void main(String[] args) {
		Map<String, Integer> campeaoMundialFifa = new HashMap<>();
		
		campeaoMundialFifa.put("Brasil", 5);
		campeaoMundialFifa.put("Alemanha", 4);
		campeaoMundialFifa.put("Itália", 4);
		campeaoMundialFifa.put("Urugaui", 2);
		campeaoMundialFifa.put("Argentina", 2);
		campeaoMundialFifa.put("França", 2);
		campeaoMundialFifa.put("Inglaterra", 1);
		campeaoMundialFifa.put("Espanha", 1);
		
		System.out.println(campeaoMundialFifa);
		
		campeaoMundialFifa.put("Brasil", 6);
		
		System.out.println(campeaoMundialFifa);
		
		System.out.println(campeaoMundialFifa.get("Argentina"));
		// retorna se existe ou não um campeão França
		System.out.println(campeaoMundialFifa.containsKey("França"));
		
		campeaoMundialFifa.remove("França");
		
		System.out.println(campeaoMundialFifa.containsValue(6));
		
		System.out.println(campeaoMundialFifa.size());
		
		System.out.println();
		
		//navega entre os registros do mapa
		for (Map.Entry<String, Integer> entry : campeaoMundialFifa.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		System.out.println(campeaoMundialFifa.containsKey("Estados Unidos"));
		
		System.out.println(campeaoMundialFifa.containsValue(5));
	}
}
