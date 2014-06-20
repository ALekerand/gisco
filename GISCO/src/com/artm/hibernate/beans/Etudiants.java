package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseEtudiants;



public class Etudiants extends BaseEtudiants {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Etudiants () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Etudiants (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Etudiants (
		java.lang.Integer id,
		com.artm.hibernate.beans.Nationalites codenationalite,
		com.artm.hibernate.beans.Pays codepays,
		com.artm.hibernate.beans.Santes codesante,
		com.artm.hibernate.beans.Niveaux codeniveau,
		com.artm.hibernate.beans.Matrimoniales codematrimoniale) {

		super (
			id,
			codenationalite,
			codepays,
			codesante,
			codeniveau,
			codematrimoniale);
	}

/*[CONSTRUCTOR MARKER END]*/


}