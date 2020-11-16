package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteCollection {
	
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("JavaEE", 20);
		Aula aula3 = new Aula("Trheds", 18);
		Aula aula2 = new Aula("JPA Avançado", 32);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		aulas.sort(null);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}

}
