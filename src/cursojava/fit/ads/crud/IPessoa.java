package cursojava.fit.ads.crud;

import java.util.List;

public interface IPessoa {
	public void salvar(Pessoa pessoa);
	public void atualizar(Pessoa pessoa);
	public void excluir(Pessoa pessoa);
	public List<Pessoa> listar();
}
