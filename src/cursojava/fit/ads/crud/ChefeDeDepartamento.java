package cursojava.fit.ads.crud;

import java.util.Date;

public class ChefeDeDepartamento extends Funcionario{
	
	private String departamento;
	private Date promocaoAChefe;
	
	public ChefeDeDepartamento(String novoNome, String novaIdentidade,
			Date novoNascimento) {
		super(novoNome, novaIdentidade, novoNascimento);
		
	}
	
	@Override
	public String toString(){
		return null;
	}
	
	public String qualDepartamento (){
		return this.getDepartamento();
	}
	
	public String getDepartamento() {
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


}
