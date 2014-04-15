package hibernate.beans;

import hibernate.beans.base.BaseEtudiants;



public class Etudiants extends BaseEtudiants {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Etudiants () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Etudiants (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Etudiants (
		java.lang.Integer id,
		hibernate.beans.Nationalites codenationalite,
		hibernate.beans.Pays codepays,
		hibernate.beans.Santes codesante,
		hibernate.beans.Niveaux codeniveau,
		hibernate.beans.Matrimoniales codematrimoniale) {

		super (
			id,
			codenationalite,
			codepays,
			codesante,
			codeniveau,
			codematrimoniale);
	}

/*[CONSTRUCTOR MARKER END]*/


}