package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseInscriptions;



public class Inscriptions extends BaseInscriptions {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Inscriptions () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Inscriptions (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Inscriptions (
		java.lang.Integer id,
		com.artm.hibernate.beans.Regime codeRegime,
		com.artm.hibernate.beans.Section codeSection,
		com.artm.hibernate.beans.Etudiants numetudiant,
		com.artm.hibernate.beans.Annees codeAnnees) {

		super (
			id,
			codeRegime,
			codeSection,
			numetudiant,
			codeAnnees);
	}

/*[CONSTRUCTOR MARKER END]*/


}