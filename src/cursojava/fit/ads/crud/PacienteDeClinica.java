package cursojava.fit.ads.crud;

import java.util.Date;

public class PacienteDeClinica extends Pessoa {
	
	//----Propriedades----//
	private String planoDeSaude;
	public String getPlanodeSaude() 
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
		this.planoDeSaude = nPlanoDeSaude;
	}
	public PacienteDeClinica() 
	{		
	}
	
	//----Métodos----//
	@Override
	public String toString()
	{
		return super.toString() + String.format( ", planoDeSaude: %s", this.planoDeSaude );
	}
	

}