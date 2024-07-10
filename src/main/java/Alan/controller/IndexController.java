/**
 * 
 */
package Alan.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * @author alan.vaz
 *
 */
@Named
@ViewScoped
public class IndexController implements Serializable {

	private static final long serialVersionUID = -3176307559028924604L;

	public String goToJogosPage() {
	    return "/jogos/list.xhtml";
	}
}
