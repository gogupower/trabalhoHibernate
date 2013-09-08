package cursojava.fit.ads.crud;

import java.util.Date;

public class Funcionario extends Pessoa {

	public Funcionario(String novoNome, String novaIdentidade, Date novoNascimento) {
		super(novoNome, novaIdentidade, novoNascimento);
		this.setNome(novoNome);
		this.setDpt(dpt);
		this.setSalario(salario);
		this.identificador = proximo++;

	}

	private int identificador;
	private static int proximo = 1;
	private String cpf;
	private String nome;
	private String dpt;
	private double salario;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		this.nome = n;

	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
