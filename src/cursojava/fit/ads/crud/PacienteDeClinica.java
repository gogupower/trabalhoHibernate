package cursojava.fit.ads.crud;

import java.util.Date;

public class PacienteDeClinica extends Pessoa {
	
	//----Propriedades----//
	private String planoDeSaude;
	public String getPlanoDeSaude() 
	{
		return planoDeSaude;
	}
	public void setPlanoDeSaude(String planoDeSaude) 
	{
		this.planoDeSaude = planoDeSaude;
	}

	//----Construtores----//
	public PacienteDeClinica(String nNome, String nIdentidade, Date nNascimento, String nPlanoDeSaude) 
	{
		super(nNome, nIdentidade, nNascimento);
		this.setPlanoDeSaude(nPlanoDeSaude);
	}
	public PacienteDeClinica() 
	{		
	}
	
	//----Métodos----//
	@Override
	public String toString()
	{
		return super.toString() + String.format( ", Plano De Saude: %s", this.planoDeSaude );
	}

}