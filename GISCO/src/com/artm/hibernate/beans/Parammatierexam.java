package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseParammatierexam;



public class Parammatierexam extends BaseParammatierexam {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Parammatierexam () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Parammatierexam (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Parammatierexam (
		java.lang.Integer id,
		com.artm.hibernate.beans.Section codeSection,
		com.artm.hibernate.beans.TypeMatiereExam codeTypeExam) {

		super (
			id,
			codeSection,
			codeTypeExam);
	}

/*[CONSTRUCTOR MARKER END]*/


}