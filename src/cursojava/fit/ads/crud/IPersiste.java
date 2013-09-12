package cursojava.fit.ads.crud;

public interface IPersiste 
{
	public void salvar(Pessoa pessoa);
	
	public void atualizar (Pessoa pessoa);
	
	public void excluir (Pessoa pessoa);
	
	public Pessoa buscar(int codigo);
}
