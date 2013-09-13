package cursojava.fit.ads.crud;

import java.util.List;

public interface IPersiste 
{
	public void salvar(Object obj);
	
	public void atualizar (Object obj);
	
	public void excluir (Object obj);
	
	public <T> List<T> listar(Class<T> pessoa);
}
