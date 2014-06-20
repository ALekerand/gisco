package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseNoteconcours;



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
		com.artm.hibernate.beans.Candidat numCandidat,
		com.artm.hibernate.beans.Matiereconcours codeMatiereConcours) {

		super (
			id,
			numCandidat,
			codeMatiereConcours);
	}

/*[CONSTRUCTOR MARKER END]*/


}