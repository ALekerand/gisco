package hibernate.beans;

import hibernate.beans.base.BaseCaisconcours;



public class Caisconcours extends BaseCaisconcours {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Caisconcours () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Caisconcours (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Caisconcours (
		java.lang.Integer id,
		hibernate.beans.Inscriptionconcours codeInscriptionConcours,
		hibernate.beans.Mode codeMode) {

		super (
			id,
			codeInscriptionConcours,
			codeMode);
	}

/*[CONSTRUCTOR MARKER END]*/


}