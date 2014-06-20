package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseCaisconcours;



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
		com.artm.hibernate.beans.Inscriptionconcours codeInscriptionConcours,
		com.artm.hibernate.beans.Mode codeMode) {

		super (
			id,
			codeInscriptionConcours,
			codeMode);
	}

/*[CONSTRUCTOR MARKER END]*/


}