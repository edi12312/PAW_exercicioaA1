package br.com.unipe.aula.model;

public class Morador {
	private String nome;
	private String local;
	
	public Morador() {}
	
	public Morador(String nome, String local) {
		super();
		this.nome = nome;
		this.local = local;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

}
