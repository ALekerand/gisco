package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseAnneeconcours;



public class Anneeconcours extends BaseAnneeconcours {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Anneeconcours () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Anneeconcours (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Anneeconcours (
		java.lang.Integer id,
		com.artm.hibernate.beans.Pays codepays,
		com.artm.hibernate.beans.Concours codeConcours) {

		super (
			id,
			codepays,
			codeConcours);
	}

/*[CONSTRUCTOR MARKER END]*/


}