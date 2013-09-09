package cursojava.fit.ads.crud;

import java.util.Date;

public class PacienteDeClinica extends Pessoa {

	private String planoDeSaude;

	public PacienteDeClinica(String nNome, String nIdentidade, Date nNascimento, String nPlanoDeSaude) {
		super(nNome, nIdentidade, nNascimento);
		this.planoDeSaude = nPlanoDeSaude;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + this.getPlanodeSaude();
	}

	public String getPlanodeSaude() {
		return planoDeSaude;
	}

	public void setPlanoDeSaude(String planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
}