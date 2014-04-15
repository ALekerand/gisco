package hibernate.beans;

import hibernate.beans.base.BaseLogerPK;

public class LogerPK extends BaseLogerPK {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public LogerPK () {}
	
	public LogerPK (
		hibernate.beans.Etudiants numetudiant,
		hibernate.beans.Logement codeLoge) {

		super (
			numetudiant,
			codeLoge);
	}
/*[CONSTRUCTOR MARKER END]*/


}