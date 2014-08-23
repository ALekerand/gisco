package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseVisite;



public class Visite extends BaseVisite {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Visite () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Visite (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Visite (
		java.lang.Integer id,
		com.artm.hibernate.beans.Candidat numCandidat) {

		super (
			id,
			numCandidat);
	}

/*[CONSTRUCTOR MARKER END]*/


}