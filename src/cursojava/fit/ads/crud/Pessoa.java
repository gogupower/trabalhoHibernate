package cursojava.fit.ads.crud;

import java.util.Date;

public abstract class Pessoa {

	// ----Propriedades----//
	private int codigo;
	private String nome;
	private String identidade;
	private Date nascimento;

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	// ----Construtores----//
	public Pessoa(String novoNome, String novaIdentidade, Date novoNascimento) {
		this.setNome(novoNome);
		this.setIdentidade(novaIdentidade);
		this.setNascimento(novoNascimento);
	}

	public Pessoa() { }

	// ----Métodos----//
	@Override
	public String toString() {
		return String.format(
				"Identidade: %s, Nome: %s, Data de Nascimento: %s", this.identidade, this.nome, this.nascimento);
	}
}
