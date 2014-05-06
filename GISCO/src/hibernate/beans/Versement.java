package hibernate.beans;

import hibernate.beans.base.BaseVersement;



public class Versement extends BaseVersement {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Versement () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Versement (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Versement (
		java.lang.Integer id,
		hibernate.beans.Annees codeAnnees,
		hibernate.beans.Origine codeOriginr,
		hibernate.beans.Activites codeActivite,
		hibernate.beans.Mode codeMode) {

		super (
			id,
			codeAnnees,
			codeOriginr,
			codeActivite,
			codeMode);
	}

/*[CONSTRUCTOR MARKER END]*/


}