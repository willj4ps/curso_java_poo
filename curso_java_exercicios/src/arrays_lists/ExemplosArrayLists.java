package arrays_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemplosArrayLists {
	
public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		
		for (String elementos:list) {
			System.out.println(elementos);
		}
		System.out.println("-----------------");
		
		// list.remove(1); // remove o elemento do �ndice 1
		
		list.removeIf(x -> x.charAt(0) == 'M'); // remove todos que come�am com a letra 'M', utilizando um predicado
		
		for (String elementos:list) {
			System.out.println(elementos);
		}
		System.out.println("---------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // quando n�o encontra o elemento retorna -1
		System.out.println("---------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// Leitura do comando acima:
		// foi criada a vari�vel "result" para representar uma nova lista original
		// convertida para stream (aceita comandos com express�es lambda)
		// a partir do Stream chama a fun��o "filter", passando o predicado
		// e depois usa o collect para devolver para a lista
		// **** O sinal "->" do filtro significa "tal que"
		for (String elementos:result) {
			System.out.println(elementos);
		}
		System.out.println("---------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		// Leitura do comando acima:
		// vari�vel "name" do tipo String, convertida para stream (que aceita express�es lambda)
		// a partir do stream passa o filter (filtro) com predicado
		// e depois chama a fun��o "findFirst" + a condi��o orElse
		// ou seja, tenta encontrar a letra, caso n�o encontre retorna nulo
		System.out.println(name);
		System.out.println("-------------");
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // segundo exemplo
		System.out.println(name1);
	}

}
