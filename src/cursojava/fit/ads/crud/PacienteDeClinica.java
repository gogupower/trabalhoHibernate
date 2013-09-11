package cursojava.fit.ads.crud;

import java.util.Date;

public class PacienteDeClinica extends Pessoa {

	//----Propriedades----//
	private String planoDeSaude;

	public String getPlanodeSaude() {
		return this.planoDeSaude;
	}

	public void setPlanoDeSaude(String planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	//----Construtores----//
	public PacienteDeClinica() { }

	public PacienteDeClinica(String novoNome, String novoIdentidade, Date novoNascimento, String novoPlanoDeSaude) {
		super(novoNome, novoIdentidade, novoNascimento);
		this.setPlanoDeSaude(novoPlanoDeSaude);
	}

	//----Métodos----//
	@Override
	public String toString() {
		return super.toString() + String.format( ", Plano De Saude: %s", this.planoDeSaude );
	}
}