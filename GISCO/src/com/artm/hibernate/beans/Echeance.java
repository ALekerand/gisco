package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseEcheance;



public class Echeance extends BaseEcheance {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Echeance () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Echeance (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Echeance (
		java.lang.Integer id,
		com.artm.hibernate.beans.Ecolages codeEcolage) {

		super (
			id,
			codeEcolage);
	}

/*[CONSTRUCTOR MARKER END]*/


}