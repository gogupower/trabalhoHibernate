package cursojava.fit.ads.crud;

import java.util.Date;

public class Funcionario extends Pessoa {

	private String departamento;
	private double salario;

	public Funcionario(String novoNome, String novaIdentidade, Date novoNascimento, String novoDepartamento, double novoSalario) {
		super(novoNome, novaIdentidade, novoNascimento);

		this.setDepartamento(novoDepartamento);
		this.setSalario(novoSalario);
	}

	@Override
	public String toString() {
		return super.toString() + " - "   + this.getDepartamento()  +  " - "   + this.getSalario();
	}
	
	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}