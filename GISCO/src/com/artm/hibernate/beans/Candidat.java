package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseCandidat;



public class Candidat extends BaseCandidat {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Candidat () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Candidat (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Candidat (
		java.lang.Integer id,
		com.artm.hibernate.beans.Nationalites codenationalite,
		com.artm.hibernate.beans.Pays codepays,
		com.artm.hibernate.beans.Sexes codesexe,
		com.artm.hibernate.beans.Niveaux codeniveau,
		com.artm.hibernate.beans.Diplomes codeDiplome) {

		super (
			id,
			codenationalite,
			codepays,
			codesexe,
			codeniveau,
			codeDiplome);
	}

/*[CONSTRUCTOR MARKER END]*/


}