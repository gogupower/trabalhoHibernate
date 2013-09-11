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

	//----M�todos----//	
	@Override
	public String toString() {
		return super.toString() + String.format( ", Admitido em: %s, Salario Atual: %s", this.admissao, this.salario );
	}

	//---- @thiagosoares: Adicionei o m�todo pq pedia no exerc�cio, mas acho que o getSalario � que deveria ser usado. ---//
	//---- @nonatorw: Solu��o simples - retornar a chamada do m�todo getSalario() ---//
	public Double qualSalario() {
		// return this.salario;
		return this.getSalario();
	}
}