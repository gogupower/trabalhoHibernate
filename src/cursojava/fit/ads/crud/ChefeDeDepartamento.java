package cursojava.fit.ads.crud;

import java.util.Date;

public class ChefeDeDepartamento extends Funcionario{
	
	//----Propriedades----//
	private String departamento;
	private Date promocaoAChefe;

	public String getDepartamento()	{
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Date getPromocaoAChefe() {
		return promocaoAChefe;
	}
	public void setPromocaoAChefe(Date promocaoAChefe) {
		this.promocaoAChefe = promocaoAChefe;
	}

	//----Construtores----//
	public ChefeDeDepartamento(String novoNome, String novaIdentidade, Date novoNascimento, Date novoAdmissao, Double novoSalario, String novoDepartamento, Date novoPromocaoAChefe){
		super(novoNome, novaIdentidade, novoNascimento, novoAdmissao, novoSalario);
		this.setDepartamento(novoDepartamento);
		this.setPromocaoAChefe(novoPromocaoAChefe);
	}
	public ChefeDeDepartamento() { }
	
	//----M�todos----//
	@Override
	public String toString() {
		return super.toString() + String.format( ", Departamento: %s, Promovido em: %s", this.departamento, this.promocaoAChefe );
	}
	
	
	
}
