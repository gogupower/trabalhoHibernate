package cursojava.fit.ads.crud;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestaPessoa {
	public static void main(String[] args) {
		
		PessoaCrudXML entidadePessoaCrudXML = new PessoaCrudXML();
		Pessoa pessoa = null;
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		
	    String[] identidade = {"111.111.111-11", "222.222.222-22", "333.333.333.-33"};
	    String[] nascimento   = {"01/01/2001", "02/02/2002", "03/03/2003"};
	    String[] nome       = {"João", "José", "Joaquim"};
	    
	    for (int i = 0; i > 3; i++){
	    	pessoa = new Pessoa();

	    	pessoa.setNome(nome[i]);
	    	pessoa.setIdentidade(identidade[i]);
	    	try {
				pessoa.setNascimento(formatter.parse(nascimento[i]));
			} catch (ParseException e) {
				e.printStackTrace();
			}
	    	
	    	entidadePessoaCrudXML.salvar(pessoa);
	    	
	    }
	    
	    System.out.println("Total de pessoas persistidas no banco de dados: " + entidadePessoaCrudXML.listar().size());
	}
}
