package cursojava.fit.ads.crud;

import java.util.Date;

public class Funcionario extends Pessoa 
{
	
	//----Propriedades----//

	private String departamento;
	public String getDepartamento() {
		return this.departamento;
	}
	public void setDepartamento(String departamento) 
	{
		this.departamento = departamento;
	}
	
	private Date admissao; 	
	public Date getAdmissao() 
	{
		return admissao;
	}	
	public void setAdmissao(Date admissao) 
	{
		this.admissao = admissao;
	}
	
	private Double salario;
	public Double getSalario() 
	{
		return salario;
	}	
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}

	//----Construtores----//
	public Funcionario(String novoNome, String novaIdentidade, Date novoNascimento, Date novoAdmissao, Double novoSalario) 
	{
		super(novoNome, novaIdentidade, novoNascimento);
		this.admissao = novoAdmissao;
		this.salario = novoSalario;
	}
	public Funcionario()
	{
	}
	
	//----Métodos----//	
	@Override
	public String toString()
	{
		return super.toString() + String.format( ", admitido: %s, salario: %s", this.admissao, this.salario );
	}

}



