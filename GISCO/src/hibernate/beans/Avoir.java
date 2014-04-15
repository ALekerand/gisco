package hibernate.beans;

import hibernate.beans.base.BaseAvoir;



public class Avoir extends BaseAvoir {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Avoir () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Avoir (
		hibernate.beans.Sexes codesexe,
		hibernate.beans.Etudiants numetudiant) {

		super (
			codesexe,
			numetudiant);
	}

/*[CONSTRUCTOR MARKER END]*/


}