package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseVersement;



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
		com.artm.hibernate.beans.Annees codeAnnees,
		com.artm.hibernate.beans.Origine codeOriginr,
		com.artm.hibernate.beans.Activites codeActivite,
		com.artm.hibernate.beans.Mode codeMode) {

		super (
			id,
			codeAnnees,
			codeOriginr,
			codeActivite,
			codeMode);
	}

/*[CONSTRUCTOR MARKER END]*/


}