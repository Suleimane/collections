package collections;

public class Aluno {

	private String nome;
	private String wasa;

	public Aluno(String nome, String wasa) {
		if(nome == null) {
			throw new NullPointerException("Nome n�o pode ser nulo");
		}
		this.nome = nome;
		this.wasa = wasa;
	}

	public String getNome() {
		return nome;
	}

	public String getWasa() {
		return wasa;
	}
	
	
	// Se dois objetos s�o equas eles precisan ter o mesmo hashcode
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.getNome());
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}
