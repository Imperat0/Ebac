/**
 * 
 */
package br.com.rpires.dao;

import br.com.rpires.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteDAO {

	public Integer cadastrar(Cliente cliente) throws Exception;

	public Integer atualizar(Cliente cliente) throws Exception;

	public Cliente buscar(String codigo) throws Exception;

	public List<Cliente> buscarTodos() throws Exception;

	public Integer excluir(Cliente cliente) throws Exception;
}
