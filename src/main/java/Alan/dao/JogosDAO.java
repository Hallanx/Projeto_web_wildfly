/**
 * 
 */
package Alan.dao;

import Alan.dao.generic.GenericDAO;
import Alan.domain.Jogos;

/**
 * @author alan.vaz
 *
 */
public class JogosDAO extends GenericDAO<Jogos, Long> implements IJogosDAO {

	public JogosDAO() {
		super(Jogos.class);
	}

}
