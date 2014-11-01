package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseNotes;



public class Notes extends BaseNotes {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Notes () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Notes (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Notes (
		java.lang.Integer id,
		com.artm.hibernate.beans.Etudiants numetudiant,
		com.artm.hibernate.beans.Semestre codeSemestre,
		com.artm.hibernate.beans.Annees codeAnnees,
		com.artm.hibernate.beans.Matiere codeMatiere) {

		super (
			id,
			numetudiant,
			codeSemestre,
			codeAnnees,
			codeMatiere);
	}

/*[CONSTRUCTOR MARKER END]*/


}