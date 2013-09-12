package cursojava.fit.ads.crud;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cursojava.fit.ads.conexao.HibernateUtil;


public class Persiste implements IPersiste {

	public void salvar(Pessoa pessoa)
	{
		Session sessao = null;
		Transaction transacao = null;

		try
		{
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			if (pessoa instanceof Funcionario)
			{
				sessao.save((Funcionario)pessoa);
			}
			else if (pessoa instanceof PacienteDeClinica)
			{
				sessao.save((PacienteDeClinica)pessoa);
			}
			else if (pessoa instanceof ChefeDeDepartamento)
			{
				sessao.save((ChefeDeDepartamento) pessoa);
			}
			else
			{
				System.out.println("O objeto informado não é de um tipo persistível!");
				return;
			}
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
			if (pessoa instanceof Funcionario)
			{
				sessao.update((Funcionario)pessoa);
			}
			else if (pessoa instanceof PacienteDeClinica)
			{
				sessao.update((PacienteDeClinica)pessoa);
			}
			else if (pessoa instanceof ChefeDeDepartamento)
			{
				sessao.update((ChefeDeDepartamento) pessoa);
			}
			else
			{
				System.out.println("O objeto informado não é de um tipo persistível!");
				return;
			}
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
			if (pessoa instanceof Funcionario)
			{
				sessao.delete((Funcionario)pessoa);
			}
			else if (pessoa instanceof PacienteDeClinica)
			{
				sessao.delete((PacienteDeClinica)pessoa);
			}
			else if (pessoa instanceof ChefeDeDepartamento)
			{
				sessao.delete((ChefeDeDepartamento) pessoa);
			}
			else
			{
				System.out.println("O objeto informado não é de um tipo persistível!");
				return;
			}
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
	public List<Pessoa> listar(Pessoa pessoa)
	{
		Session sessao = null;
		Transaction transacao = null;
		Query consulta = null;
		List<Pessoa> resultado = null;
		try
		{
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			if (pessoa instanceof Funcionario)
			{
				consulta = sessao.createQuery("from Funcionario");
			}
			else if (pessoa instanceof ChefeDeDepartamento)
			{
				consulta = sessao.createQuery("from ChefeDeDepartamento");
			}
			else if (pessoa instanceof PacienteDeClinica)
			{
				consulta = sessao.createQuery("from PacienteDeClinica");
			}
			resultado = consulta.list();
			transacao.commit();
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

	@Override
	public Pessoa buscar(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
