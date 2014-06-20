package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseLoger;



public class Loger extends BaseLoger {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Loger () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Loger (com.artm.hibernate.beans.LogerPK id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/


}