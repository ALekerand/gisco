package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseParammatiere;



public class Parammatiere extends BaseParammatiere {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Parammatiere () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Parammatiere (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Parammatiere (
		java.lang.Integer id,
		com.artm.hibernate.beans.Section codeSection,
		com.artm.hibernate.beans.TypeMatiere codeType) {

		super (
			id,
			codeSection,
			codeType);
	}

/*[CONSTRUCTOR MARKER END]*/


}