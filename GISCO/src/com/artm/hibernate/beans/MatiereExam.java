package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseMatiereExam;



public class MatiereExam extends BaseMatiereExam {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public MatiereExam () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public MatiereExam (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public MatiereExam (
		java.lang.Integer id,
		com.artm.hibernate.beans.Section codeSection) {

		super (
			id,
			codeSection);
	}

/*[CONSTRUCTOR MARKER END]*/


}