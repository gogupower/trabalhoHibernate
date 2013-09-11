package cursojava.fit.ads.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CrudDados implements IPersistence {

	@Override
	public int salvar(Object object) 
	{
		Session sessao = null;
		Transaction transacao = null;
		//-- Conexão com o banco de dados --//
		try
		{
			sessao.beginTransaction();
		}catch(Throwable e){
			System.out.println("Não foi possível iniciar a transação. Erro: " + e.getMessage());
		}
		
		return 0;
	}

	@Override
	public void atualizar(Object object) {
		
	}

	@Override
	public void excluir(Object object) {
		
	}

	@Override
	public Object buscarNoBanco(Object object) {
		return null;
	}

}
