package cursojava.fit.ads.crud;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cursojava.fit.ads.conexao.HibernateUtil;


public class PessoaCrudXml {

	public void salvar(Pessoa pessoa)
	{
		Session sessao = null;
		Transaction transacao = null;
		try
		{
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.save(pessoa);
			transacao.commit();
		}
		catch(HibernateException e)
		{
			System.out.println("Não foi possível salvar o contato.Erro: " + e.getMessage());
		}
		finally
		{
			try
			{
				sessao.close();
			}
			catch(Throwable e)
			{
				System.out.println("Erro ao fechar operação de inserção.Mensagem : " + e.getMessage());
			}
		}
	}
	
	public void atualizar(Pessoa pessoa)
	{
		Session sessao = null;
		Transaction transacao = null;
		try
		{
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.update(pessoa);
			transacao.commit();
		}
		catch(HibernateException e)
		{
			System.out.println("Não foi possível alterar o contato.Erro: " +e.getMessage());
		}
		finally
		{
			try
			{
			sessao.close();
			}
			catch(Throwable e)
			{
			System.out.println("Erro ao fechar a operação de atualização.Erro : " +e.getMessage());
			}
		}
	}
	
	public void excluir(Pessoa pessoa)
	{
		Session sessao = null;
		Transaction transacao = null;
		try
		{
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.delete(pessoa);
			transacao.commit();
		}
		catch(HibernateException e)
		{
			System.out.println("Não foi possível selecionar contatos. Erro : " +e.getMessage());
		}
		finally
		{
			try
			{
				sessao.close();
			}
			catch(Throwable e)
			{
				System.out.println("Erro ao fechar a operação" +e.getMessage());
			}
		}
	}
	public List<Pessoa> listar()
	{
		Session sessao = null;
		Transaction transacao = null;
		Query consulta = null;
		List<Pessoa> resultado = null;
		try
		{
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			consulta = sessao.createQuery("from Pessoa");
			resultado = consulta.list();
			transacao.commit();
			
			return resultado;
		}
		catch(HibernateException e)
		{
			System.out.println("Não foi possível selecionar pessoas.Erro: " +e.getMessage());
		}
		finally
		{
			try
			{
				sessao.close();
			}
			catch(Throwable e)
			{
				System.out.println("Erro ao fechar operação de consulta. Erro:" +e.getMessage());
			}
		}
		return null;
	}
}
	
