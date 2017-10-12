package model;

public class Indirizzo {
	private Long id;
	private String nome;
	
	public Indirizzo(){
		
	}
	
	public Indirizzo(String _nome) {
		this.nome=_nome;
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
	
}
