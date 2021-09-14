package d_colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		// Mapa -> Chave Valor

		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Robero");
		usuarios.put(2, "Rafaela");
		usuarios.put(21, "Rafael");
		usuarios.put(3, "Rebeca");
		usuarios.put(20, "Lucianna");

		System.out.println(usuarios.size());
		System.out.println(usuarios.keySet()); // Retorna todas as chaves
		System.out.println(usuarios.values()); // Retorna todos os valores
		System.out.println(usuarios.entrySet()); // Chave e Valor
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Roberto"));
		System.out.println(usuarios.get(2));

		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey());
			System.out.println(": " + registro.getValue());
		}

	}

}
