package model;

import java.util.HashSet;
import java.util.Set;

public class Corso {
	private Long id;
	private String nome;
	private Set<Studente> studenti;
	
	public Corso() {
		studenti=new HashSet<>();
	}
	
	public Corso(String _nome) {
		this.nome=_nome;
		studenti=new HashSet<>();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(Set<Studente> studenti) {
		this.studenti = studenti;
	}
	
}
