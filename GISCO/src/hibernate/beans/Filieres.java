package hibernate.beans;

import hibernate.beans.base.BaseFilieres;



public class Filieres extends BaseFilieres {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Filieres () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Filieres (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Filieres (
		java.lang.Integer id,
		hibernate.beans.Ecole codeEcole) {

		super (
			id,
			codeEcole);
	}

/*[CONSTRUCTOR MARKER END]*/


}