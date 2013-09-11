package cursojava.fit.ads.crud;

import java.util.Date;

public class ChefeDeDepartamento extends Funcionario {

	//----Propriedades----//
	private String departamento;
	private Date promocaoAChefe;

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Date getPromocaoAChefe() {
		return this.promocaoAChefe;
	}

	public void setPromocaoAChefe(Date promocaoAChefe) {
		this.promocaoAChefe = promocaoAChefe;
	}

	//----Construtores----//
	public ChefeDeDepartamento() { }

	public ChefeDeDepartamento(String novoNome, String novaIdentidade, Date novoNascimento, 
			Date novoAdmissao, Double novoSalario, String novoDepartamento, Date novoPromocaoAChefe) {
		super(novoNome, novaIdentidade, novoNascimento, novoAdmissao, novoSalario);
		this.setDepartamento(novoDepartamento);
		this.setPromocaoAChefe(novoPromocaoAChefe);
	}

	//----Métodos----//
	@Override
	public String toString() {
		return super.toString() + String.format( ", Departamento: %s, Promovido em: %s", this.departamento, this.promocaoAChefe );
	}
}