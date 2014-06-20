package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseAvoir;



public class Avoir extends BaseAvoir {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Avoir () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Avoir (
		com.artm.hibernate.beans.Sexes codesexe,
		com.artm.hibernate.beans.Etudiants numetudiant) {

		super (
			codesexe,
			numetudiant);
	}

/*[CONSTRUCTOR MARKER END]*/


}