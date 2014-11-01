package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the user_role table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="user_role"
 */

public abstract class BaseUserRole  implements Serializable {

	public static String REF = "UserRole";
	public static String PROP_AUTORITY = "Autority";
	public static String PROP_ID = "Id";


	// constructors
	public BaseUserRole () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUserRole (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String autority;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Users> users;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="USER_ROLE_ID"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: AUTORITY
	 */
	public java.lang.String getAutority () {
		return autority;
	}

	/**
	 * Set the value related to the column: AUTORITY
	 * @param autority the AUTORITY value
	 */
	public void setAutority (java.lang.String autority) {
		this.autority = autority;
	}



	/**
	 * Return the value associated with the column: Users
	 */
	public java.util.Set<com.artm.hibernate.beans.Users> getUsers () {
		return users;
	}

	/**
	 * Set the value related to the column: Users
	 * @param users the Users value
	 */
	public void setUsers (java.util.Set<com.artm.hibernate.beans.Users> users) {
		this.users = users;
	}

	public void addToUsers (com.artm.hibernate.beans.Users users) {
		if (null == getUsers()) setUsers(new java.util.TreeSet<com.artm.hibernate.beans.Users>());
		getUsers().add(users);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.UserRole)) return false;
		else {
			com.artm.hibernate.beans.UserRole userRole = (com.artm.hibernate.beans.UserRole) obj;
			if (null == this.getId() || null == userRole.getId()) return false;
			else return (this.getId().equals(userRole.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}