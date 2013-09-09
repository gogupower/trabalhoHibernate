package cursojava.fit.ads.crud;

import java.util.Date;

public class Pessoa {
	private String nome;
	private Date nascimento;
	private String identidade;
	
	public Pessoa(String novoNome, String novaIdentidade, Date novoNascimento){
		this.setNome(novoNome);
		this.setIdentidade(novaIdentidade);
		this.setNascimento(novoNascimento);
	}
	
	@Override
	public String toString(){
		return "Nome: " + this.getNome() + " - " + this.getNascimento() + " - " + this.getIdentidade() ;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdentidade() {
		return this.identidade;
	}
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	public Date getNascimento() {
		return this.nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}	
}