package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseAbsence;



public class Absence extends BaseAbsence {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Absence () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Absence (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Absence (
		java.lang.Integer id,
		com.artm.hibernate.beans.Semestre codeSemestre,
		com.artm.hibernate.beans.Etudiants numetudiant,
		com.artm.hibernate.beans.Nature codeNature,
		com.artm.hibernate.beans.Annees codeAnnees,
		com.artm.hibernate.beans.Motif codeMotif) {

		super (
			id,
			codeSemestre,
			numetudiant,
			codeNature,
			codeAnnees,
			codeMotif);
	}

/*[CONSTRUCTOR MARKER END]*/


}