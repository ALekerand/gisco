package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseEcolages;



public class Ecolages extends BaseEcolages {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Ecolages () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Ecolages (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Ecolages (
		java.lang.Integer id,
		com.artm.hibernate.beans.Section codeSection) {

		super (
			id,
			codeSection);
	}

/*[CONSTRUCTOR MARKER END]*/


}