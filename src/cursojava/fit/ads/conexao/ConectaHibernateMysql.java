package cursojava.fit.ads.conexao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ConectaHibernateMysql{
	public static void main (String[] args){
		Session sessao = null;
		try{
			sessao = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Conectou!");
		} catch (HibernateException e){
			System.out.println("Erro ao abrir a conexao com o banco de dados: " + e.getMessage());
		} finally {
			sessao.close();
		}
	}
}
