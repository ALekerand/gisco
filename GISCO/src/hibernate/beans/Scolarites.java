package hibernate.beans;

import hibernate.beans.base.BaseScolarites;



public class Scolarites extends BaseScolarites {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Scolarites () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Scolarites (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Scolarites (
		java.lang.Integer id,
		hibernate.beans.Etudiants numetudiant,
		hibernate.beans.Annees codeAnnees) {

		super (
			id,
			numetudiant,
			codeAnnees);
	}

/*[CONSTRUCTOR MARKER END]*/


}