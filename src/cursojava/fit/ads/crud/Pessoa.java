package cursojava.fit.ads.crud;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String identidade;
	private Date nascimento;
	
	public Pessoa(String novoNome, String novaIdentidade, Date novoNascimento){
		this.setNome(novoNome);
		this.setIdentidade(novaIdentidade);
		this.setNascimento(novoNascimento);
	}
	
	@Override
	public String toString(){
		return this.nome + " - " + this.identidade + " - " + this.nascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdentidade() {
		return identidade;
	}
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
