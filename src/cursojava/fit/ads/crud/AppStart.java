package cursojava.fit.ads.crud;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class AppStart 
{

	private static DateFormat DateFormater = new SimpleDateFormat("dd/MM/yyyy");
	private static IPersiste Persiste = new Persiste();
	
	public static void main(String[] args) {
		try
		{		
			//Create a list of Funcionarios.
			List<Funcionario> listToAddFunc = new ArrayList<Funcionario>();
			listToAddFunc.add(new Funcionario("Fulano","10.10.10.2",DateFormater.parse("10/10/2000"),DateFormater.parse("12/12/2012"), 22.00));
			listToAddFunc.add(new Funcionario("Ciclano","10.10.10.3",DateFormater.parse("11/10/2000"),DateFormater.parse("12/12/2012"), 122.00));
			listToAddFunc.add(new Funcionario("Mano","10.10.10.4",DateFormater.parse("12/10/2000"),DateFormater.parse("12/08/2012"), 3422.20));
			
			//Save the previous List.
			for(Funcionario x : listToAddFunc)
				Persiste.salvar(x);	
			
			//Load all the Funcionarios.
			List<Funcionario> savedListFunc = Persiste.listar(Funcionario.class);
			
			//Print then.
			System.out.println("Funcionarios salvos");
			for(Funcionario x : savedListFunc )
				System.out.println(x.toString());
			
			//Alter the second and delete the first.
			savedListFunc.get(1).setNome("NovoNome");
			Persiste.atualizar(savedListFunc.get(1));
			Persiste.excluir(savedListFunc.get(0));
			
			// Show it!
			System.out.println("Lista atualizada");
			List<Funcionario> updatedListFunc = Persiste
					.listar(Funcionario.class);
			for (Funcionario x : updatedListFunc)
				System.out.println(x.toString());

			
			// Create a list of ChefeDeDepartamentos.
			List<ChefeDeDepartamento> listToAddChefe = new ArrayList<ChefeDeDepartamento>();
			listToAddChefe.add(new ChefeDeDepartamento("Fulano", "10.10.10.6",	DateFormater.parse("10/10/2000"), DateFormater.parse("12/12/2012"), 22.00, "Departamento1", DateFormater.parse("10/12/2000")));
			listToAddChefe.add(new ChefeDeDepartamento("Ciclano", "10.10.10.7",	DateFormater.parse("11/10/2000"), DateFormater.parse("12/12/2012"), 122.00, "Departamento2", DateFormater.parse("12/12/2010")));
			listToAddChefe.add(new ChefeDeDepartamento("Mano", "10.10.10.8",DateFormater.parse("12/10/2000"), DateFormater.parse("12/08/2012"), 3422.20, "Departamento3", DateFormater.parse("05/10/2000")));

			// Save the previous List.
			for (ChefeDeDepartamento x : listToAddChefe)
				Persiste.salvar(x);

			// Load all the ChefeDeDepartamentos.
			List<ChefeDeDepartamento> savedListChefe = Persiste
					.listar(ChefeDeDepartamento.class);

			// Print then.
			System.out.println("ChefeDeDepartamentos salvos");
			for (ChefeDeDepartamento x : savedListChefe)
				System.out.println(x.toString());

			// Alter the second and delete the first.
			savedListChefe.get(1).setNome("NovoNome");
			Persiste.atualizar(savedListChefe.get(1));
			Persiste.excluir(savedListChefe.get(0));

			// Show it!
			System.out.println("Lista atualizada");
			List<ChefeDeDepartamento> updatedListChefe = Persiste
					.listar(ChefeDeDepartamento.class);
			for (ChefeDeDepartamento x : updatedListChefe)
				System.out.println(x.toString());
			
						
			
			//Create a list of PacienteDeClinicas.
			List<PacienteDeClinica> listToAddPaci = new ArrayList<PacienteDeClinica>();
			listToAddPaci.add(new PacienteDeClinica("João","10.10.10.101",DateFormater.parse("10/10/2000"),"SalvaVidas"));
			listToAddPaci.add(new PacienteDeClinica("Maria","10.10.10.102",DateFormater.parse("11/10/2000"), "NãoMorreNão"));
			listToAddPaci.add(new PacienteDeClinica("Rapaz","10.10.10.103",DateFormater.parse("12/10/2000"), "Vida!"));
			
			//Save the previous List.
			for(PacienteDeClinica x : listToAddPaci)
				Persiste.salvar(x);	
			
			//Load all the PacienteDeClinicas.
			List<PacienteDeClinica> savedListPaci = Persiste.listar(PacienteDeClinica.class);
			
			//Print then.
			System.out.println("PacienteDeClinicas salvos");
			for(PacienteDeClinica x : savedListPaci )
				System.out.println(x.toString());
			
			//Alter the second and delete the first.
			savedListPaci.get(1).setNome("NovoNome");
			Persiste.atualizar(savedListPaci.get(1));
			Persiste.excluir(savedListPaci.get(0));
			
			// Show it!
			System.out.println("Lista atualizada");
			List<PacienteDeClinica> updatedListPaci = Persiste
					.listar(PacienteDeClinica.class);
			for (PacienteDeClinica x : updatedListPaci)
				System.out.println(x.toString());
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println( "Ocorreu um erro:" + e.getMessage());			
		}
	}

}
