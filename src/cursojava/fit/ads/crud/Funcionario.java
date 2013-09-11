package cursojava.fit.ads.crud;

import java.util.Date;

public class Funcionario extends Pessoa {

	//----Propriedades----//
	private Date admissao; 	
	private Double salario;

	public Date getAdmissao() {
		return admissao;
	}	

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public Double getSalario() {
		return salario;
	}	

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Funcionario() { }

	public Funcionario(String novoNome, String novaIdentidade, Date novoNascimento, Date novoAdmissao, Double novoSalario) {
		super(novoNome, novaIdentidade, novoNascimento);
		this.setAdmissao(novoAdmissao);
		this.setSalario(novoSalario);
	}

	//----Métodos----//	
	@Override
	public String toString() {
		return super.toString() + String.format( ", Admitido em: %s, Salario Atual: %s", this.admissao, this.salario );
	}

	//---- @thiagosoares: Adicionei o método pq pedia no exercício, mas acho que o getSalario é que deveria ser usado. ---//
	//---- @nonatorw: Solução simples - retornar a chamada do método getSalario() ---//
	public Double qualSalario() {
		// return this.salario;
		return this.getSalario();
	}
}