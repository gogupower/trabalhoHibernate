package cursojava.fit.ads.crud;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cursojava.fit.ads.conexao.HibernateUtil;


public class Persiste implements IPersiste {

	Session sessao = null;
	Transaction transacao = null;
	
	public void salvar(Object obj)
	{		
		try
		{
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.save(obj);
			transacao.commit();	
		}
		catch(HibernateException e)
		{
			try
			{
				transacao.rollback();
				System.out.println("Não foi possível salvar o contato.Erro: " + e.getMessage());
			}
			catch(Exception ex){}
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
	
	public void atualizar(Object obj)
	{
		try
		{
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.update(obj);
			transacao.commit();
		}
		catch(HibernateException e)
		{
			try
			{
				transacao.rollback();
				System.out.println("Não foi possível salvar o contato.Erro: " + e.getMessage());
			}
			catch(Exception ex){}
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
	
	public void excluir(Object obj)
	{
		try
		{
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.delete(obj);
			transacao.commit();
		}
		catch(HibernateException e)
		{			
			try
			{
				transacao.rollback();
				System.out.println("Não foi possível salvar o contato.Erro: " + e.getMessage());
			}
			catch(Exception ex){}
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
	@SuppressWarnings("unchecked")
	public <T> List<T> listar(Class<T> type)
	{
		Query consulta = null;
		List<T> resultado = null;
		try
		{
			sessao = HibernateUtil.getSessionFactory().openSession();
			consulta = sessao.createQuery("from " + type.getName());
			resultado = (List<T>)consulta.list();
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
		return resultado;
	}

}
	
