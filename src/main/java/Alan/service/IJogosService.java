/**
 * 
 */
package Alan.service;

import Alan.domain.Jogos;
import Alan.exceptions.DAOException;
import Alan.generic.IGenericService;

/**
 * @author alan.vaz
 *
 */
public interface IJogosService extends IGenericService<Jogos, Long> {

	Jogos buscarPorNome(Long nome) throws DAOException;

}
