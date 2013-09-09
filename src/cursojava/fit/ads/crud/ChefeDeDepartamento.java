package cursojava.fit.ads.crud;

import java.util.Date;

public class ChefeDeDepartamento extends Funcionario{
	
	//----Propriedades----//
	private String departamento;
	public String getDepartamento() 
	{
		return departamento;
	}
	public void setDepartamento(String departamento) 
	{
		this.departamento = departamento;
	}
	
	private Date promocaoAChefe;
	public Date getPromocaoAChefe() 
	{
		return promocaoAChefe;
	}
	public void setPromocaoAChefe(Date promocaoAChefe) 
	{
		this.promocaoAChefe = promocaoAChefe;
	}

	//----Construtores----//
	public ChefeDeDepartamento(String novoNome, String novaIdentidade, Date novoNascimento, Date novoAdmissao, Double novoSalario, String novoDepartamento, Date novoPromocaoAChefe) 
	{
		super(novoNome, novaIdentidade, novoNascimento, novoAdmissao, novoSalario);
		this.departamento = novoDepartamento;
		this.promocaoAChefe = novoPromocaoAChefe;
	}
	public ChefeDeDepartamento() 
	{
	}
	
	//----Métodos----//
	@Override
	public String toString()
	{
		return super.toString() + String.format( ", departamento: %s, promovido: %s", this.departamento, this.promocaoAChefe );
	}
	
	
	
}
