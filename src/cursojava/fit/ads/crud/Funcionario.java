package cursojava.fit.ads.crud;

import java.util.Date;

public class Funcionario extends Pessoa 
{
	
	//----Propriedades----//
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
		this.setAdmissao(novoAdmissao);
		this.setSalario(novoSalario);
	}
	public Funcionario()
	{
	}
	
	//----M�todos----//	
	@Override
	public String toString()
	{
		return super.toString() + String.format( ", Admitido em: %s, Salario Atual: %s", this.admissao, this.salario );
	}
	
	//---- @thiagosoares: Adicionei o m�todo pq pedia no exerc�cio, mas acho que o getSalario � que deveria ser usado. ---//
	public Double qualSalario()
	{
		return this.salario;
	}

}



