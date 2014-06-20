package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseNotexam;



public class Notexam extends BaseNotexam {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Notexam () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Notexam (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Notexam (
		java.lang.Integer id,
		com.artm.hibernate.beans.Etudiants numetudiant,
		com.artm.hibernate.beans.MatiereExam codeMatiereExam) {

		super (
			id,
			numetudiant,
			codeMatiereExam);
	}

/*[CONSTRUCTOR MARKER END]*/


}