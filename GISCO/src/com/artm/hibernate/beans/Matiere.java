package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseMatiere;



public class Matiere extends BaseMatiere {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Matiere () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Matiere (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Matiere (
		java.lang.Integer id,
		com.artm.hibernate.beans.Section codeSection) {

		super (
			id,
			codeSection);
	}

/*[CONSTRUCTOR MARKER END]*/


}