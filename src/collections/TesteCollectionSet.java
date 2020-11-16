package collections;

import java.util.Iterator;
import java.util.Set;

public class TesteCollectionSet {
	
	public static void main(String[] args) {
		
		Curso curso = new Curso("Certificacao Java", "Manuel Nanque");
		Aula aula1 = new Aula("JavaEE", 20);
		Aluno aluno1 = new Aluno("Iris Lopes Nanque","12345");
		Aluno aluno3 = new Aluno("Iris Lopes Nanque","12345");
		Aluno aluno4 = new Aluno("Ana Maria Duarte","12345443");
		
		curso.adiciona(aula1);
		
		curso.matricula(aluno1);
		curso.matricula(aluno3);
		curso.matricula(aluno4);
		
		System.out.println(curso);
		
		System.out.println(curso.estaMariculado(aluno1));
		
		Aluno aluno2 = new Aluno("Iris Lopes Nanque", "123455757575757");
		
		System.out.println(aluno1.equals(aluno2));
		
		System.out.println(aluno1.hashCode() == aluno2.hashCode());
		
		System.out.println(aluno1.hashCode());
		
		System.out.println(aluno2.hashCode());
		
//		Set<Aluno> listaAlunos = (Set<Aluno>) curso.getAlunos();
//		Iterator<Aluno> iterator = listaAlunos.iterator();
//		
//		while(iterator.hasNext()) {
//			Aluno proximo = iterator.next();
//			System.out.println(proximo);
//		}
		
		Aluno alunoEncontrado = curso.procura(10);
		System.out.println(alunoEncontrado.getNome());
	}

}
