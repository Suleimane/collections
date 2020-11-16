package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Curso {

	private String nome;
	private String intrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Collection<Aluno> alunos = new ArrayList<>();
	//private Set<Aluno> alunos = new HashSet<>();
	// LinkedHashSet consegue imprimir os elementos na ordem
	//private Set<Aluna> alunos = new LinkedHashSet<>();
	
	// consegue imprimir os elementos na ordem implementanldo a interface comparable
	//private Set<Aluno> alunos = new TreeSet<>();

	public Curso(String nome, String intrutor) {
		this.nome = nome;
		this.intrutor = intrutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIntrutor() {
		return intrutor;
	}

	public void setIntrutor(String intrutor) {
		this.intrutor = intrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Collection<Aluno> getAlunos() {
		return alunos;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno aluno) {
		alunos.add(aluno);
	}

	public boolean estaMariculado(Aluno aluno) {
		return alunos.contains(aluno);
	}

	public Aluno procura(int codigo) {
		ArrayList<Aluno> listaAlunos = (ArrayList<Aluno>) this.alunos;
		for (int i = 0; i < listaAlunos.size(); i++) {
			if(codigo == i) return listaAlunos.get(i);
		}
		throw new NoSuchElementException("Aluno não encontrado");
	}

}
