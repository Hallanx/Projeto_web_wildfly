/**
 * 
 */
package Alan.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Alan.dao.IJogosDAO;
import Alan.domain.Jogos;
import Alan.exceptions.DAOException;
import Alan.exceptions.MaisDeUmRegistroException;
import Alan.exceptions.TableException;
import Alan.generic.GenericService;

/**
 * @author alan.vaz
 *
 */
@Stateless
public class JogosService extends GenericService<Jogos, Long> implements IJogosService {
	
	@Inject
	public JogosService(IJogosDAO jogosDAO) {
		super(jogosDAO);
	}

	@Override
	public Jogos buscarPorNome(Long nome) throws DAOException {
		try {
			return this.dao.consultar(nome);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
