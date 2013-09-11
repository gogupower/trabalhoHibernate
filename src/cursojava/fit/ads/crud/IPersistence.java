package cursojava.fit.ads.crud;

public interface IPersistence 
{
	public int salvar(Object object);

	public void atualizar(Object object);
	
	public void excluir(Object object);
	
	public Object buscarNoBanco(Object object);
}
