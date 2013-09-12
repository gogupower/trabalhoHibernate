package cursojava.fit.ads.crud;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
	public static void main (String[] args)
	{
		DateFormat form = new SimpleDateFormat("dd/MM/yyyy");
		try 
		{
			Persiste crud = new Persiste();		
			Funcionario f1 = new Funcionario("Thiago Soares", "12345678", form.parse("21/03/1984"), form.parse("03/05/2013"), 1000.00);
			crud.salvar(f1);
			
			PacienteDeClinica p1 = new PacienteDeClinica("Thiago Soares", "12345678", form.parse("21/03/1984"), "Amil");
			crud.salvar(p1);
			
			
			
		} catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
	}
	
}
