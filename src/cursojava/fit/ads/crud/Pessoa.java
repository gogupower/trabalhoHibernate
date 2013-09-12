package cursojava.fit.ads.crud;

import java.util.Date;

public abstract class Pessoa 
{

	//----Propriedades----//	
	private int codigo;
	public int getCodigo() 
	{
		return codigo;
	}
	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}
	private String nome;	
	public String getNome() 
	{
		return nome;

	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}	
	
	private String identidade;
	public String getIdentidade() 
	{
		return identidade;

	}
	public void setIdentidade(String identidade) 
	{
		this.identidade = identidade;
	}
	
	private Date nascimento;
	public Date getNascimento() 
	{
		return nascimento;

	}
	public void setNascimento(Date nascimento) 
	{
		this.nascimento = nascimento;
	}	
		
	//----Construtores----//
	public Pessoa(String novoNome, String novaIdentidade, Date novoNascimento)
	{
		this.setNome(novoNome);
		this.setIdentidade(novaIdentidade);
		this.setNascimento(novoNascimento);
	}
	public Pessoa()
	{
	}
	
	//----Métodos----//
	@Override
	public String toString()
	{
		return String.format("Identidade: %s, Nome: %s, Data de Nascimento: %s", this.identidade, this.nome, this.nascimento );
	}
	
}

