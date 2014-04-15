package hibernate.beans;

import hibernate.beans.base.BaseInscriptions;



public class Inscriptions extends BaseInscriptions {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Inscriptions () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Inscriptions (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Inscriptions (
		java.lang.Integer id,
		hibernate.beans.Regime codeRegime,
		hibernate.beans.Section codeSection,
		hibernate.beans.Etudiants numetudiant,
		hibernate.beans.Annees codeAnnees) {

		super (
			id,
			codeRegime,
			codeSection,
			numetudiant,
			codeAnnees);
	}

/*[CONSTRUCTOR MARKER END]*/


}