package collections;

public class Aula implements Comparable<Aula>{

	private String nome;
	private int tempo;

	public Aula(String nome, int tempo) {
		
		this.nome = nome;
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " " + "Tempo: " + this.tempo;
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.nome.compareTo(outraAula.getNome());
	}
}
