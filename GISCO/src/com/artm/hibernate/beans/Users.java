package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseUsers;



public class Users extends BaseUsers {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Users () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Users (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Users (
		java.lang.Integer id,
		com.artm.hibernate.beans.Pays codepays,
		com.artm.hibernate.beans.UserRole userRole) {

		super (
			id,
			codepays,
			userRole);
	}

/*[CONSTRUCTOR MARKER END]*/


}