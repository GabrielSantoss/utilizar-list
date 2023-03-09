package collections_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		
		System.out.println("Crie uma lista e adicionse sete notas");
		List<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(7.4);
		notas.add(10.0);
		notas.add(6.8);
		notas.add(5.9);
		
		System.out.println(notas.toString());
		
		System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5.9));
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8d);

		System.out.println(notas);
		
		System.out.println("substitua a nota 5 pela nota 6: ");
		notas.set(notas.indexOf(5.9), 6.0);
		System.out.println(notas);
		
		System.out.println("confira se a nota 5 esta na lista: " + notas.contains(5.9));
		
		//System.out.println("exiba todas as notas na ordem que foram informadas: ");
		//for(Double nota : notas) System.out.println(nota);
		
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas.toString());
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.print("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println(soma);
		
		System.out.println("Exiba a media das notas: "+ (soma/notas.size()));
		
		System.out.println("Remova a nota 7: ");
		notas.remove(7.4);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7: ");
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) 
				iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("Apague toda a lista");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("Confira se a lista esá vazia: " + notas.isEmpty());
		
		
		
		
	}
	
	

}
