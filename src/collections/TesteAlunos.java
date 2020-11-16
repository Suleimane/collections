package collections;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {
	
	public static void main(String[] args) {
		
		// Não possui ordem de adição dos elementos, mais rapido para adição e remoção
		Set<String> alunos = new HashSet<>();
		
		String aluno1 = "Iris Lopes Nanque";
		String aluno2 = "Ruth Lopes Nanque";
		String aluno3 = "Suleimane Manuel Nanque";
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		System.out.println(alunos);
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
	}

}
