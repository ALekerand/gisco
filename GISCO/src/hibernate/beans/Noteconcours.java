package hibernate.beans;

import hibernate.beans.base.BaseNoteconcours;



public class Noteconcours extends BaseNoteconcours {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Noteconcours () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Noteconcours (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Noteconcours (
		java.lang.Integer id,
		hibernate.beans.Candidat numCandidat,
		hibernate.beans.Matiereconcours codeMatiereConcours) {

		super (
			id,
			numCandidat,
			codeMatiereConcours);
	}

/*[CONSTRUCTOR MARKER END]*/


}