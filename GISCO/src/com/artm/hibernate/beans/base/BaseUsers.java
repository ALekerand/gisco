package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the users table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="users"
 */

public abstract class BaseUsers  implements Serializable {

	public static String REF = "Users";
	public static String PROP_MENUITEM103 = "Menuitem103";
	public static String PROP_ENABLED = "Enabled";
	public static String PROP_MENUITEM104 = "Menuitem104";
	public static String PROP_CODEPAYS = "Codepays";
	public static String PROP_USER_NOM_PRENOMS = "UserNomPrenoms";
	public static String PROP_MENUITEM101 = "Menuitem101";
	public static String PROP_MENUITEM102 = "Menuitem102";
	public static String PROP_USER_NAME = "UserName";
	public static String PROP_SUBMENU10 = "Submenu10";
	public static String PROP_USER_ROLE = "UserRole";
	public static String PROP_USER_TEL = "UserTel";
	public static String PROP_ID = "Id";
	public static String PROP_USER_PASSWORD = "UserPassword";


	// constructors
	public BaseUsers () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUsers (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseUsers (
		java.lang.Integer id,
		com.artm.hibernate.beans.Pays codepays,
		com.artm.hibernate.beans.UserRole userRole) {

		this.setId(id);
		this.setCodepays(codepays);
		this.setUserRole(userRole);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String userName;
	private java.lang.String userPassword;
	private boolean enabled;
	private java.lang.String userNomPrenoms;
	private java.lang.String userTel;
	private boolean submenu10;
	private boolean menuitem101;
	private boolean menuitem102;
	private boolean menuitem103;
	private boolean menuitem104;

	// many to one
	private com.artm.hibernate.beans.Pays codepays;
	private com.artm.hibernate.beans.UserRole userRole;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="USER_ID"
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
	 * Return the value associated with the column: USER_NAME
	 */
	public java.lang.String getUserName () {
		return userName;
	}

	/**
	 * Set the value related to the column: USER_NAME
	 * @param userName the USER_NAME value
	 */
	public void setUserName (java.lang.String userName) {
		this.userName = userName;
	}



	/**
	 * Return the value associated with the column: USER_PASSWORD
	 */
	public java.lang.String getUserPassword () {
		return userPassword;
	}

	/**
	 * Set the value related to the column: USER_PASSWORD
	 * @param userPassword the USER_PASSWORD value
	 */
	public void setUserPassword (java.lang.String userPassword) {
		this.userPassword = userPassword;
	}



	/**
	 * Return the value associated with the column: ENABLED
	 */
	public boolean isEnabled () {
		return enabled;
	}

	/**
	 * Set the value related to the column: ENABLED
	 * @param enabled the ENABLED value
	 */
	public void setEnabled (boolean enabled) {
		this.enabled = enabled;
	}



	/**
	 * Return the value associated with the column: USER_NOM_PRENOMS
	 */
	public java.lang.String getUserNomPrenoms () {
		return userNomPrenoms;
	}

	/**
	 * Set the value related to the column: USER_NOM_PRENOMS
	 * @param userNomPrenoms the USER_NOM_PRENOMS value
	 */
	public void setUserNomPrenoms (java.lang.String userNomPrenoms) {
		this.userNomPrenoms = userNomPrenoms;
	}



	/**
	 * Return the value associated with the column: USER_TEL
	 */
	public java.lang.String getUserTel () {
		return userTel;
	}

	/**
	 * Set the value related to the column: USER_TEL
	 * @param userTel the USER_TEL value
	 */
	public void setUserTel (java.lang.String userTel) {
		this.userTel = userTel;
	}



	/**
	 * Return the value associated with the column: SUBMENU10
	 */
	public boolean isSubmenu10 () {
		return submenu10;
	}

	/**
	 * Set the value related to the column: SUBMENU10
	 * @param submenu10 the SUBMENU10 value
	 */
	public void setSubmenu10 (boolean submenu10) {
		this.submenu10 = submenu10;
	}



	/**
	 * Return the value associated with the column: MENUITEM101
	 */
	public boolean isMenuitem101 () {
		return menuitem101;
	}

	/**
	 * Set the value related to the column: MENUITEM101
	 * @param menuitem101 the MENUITEM101 value
	 */
	public void setMenuitem101 (boolean menuitem101) {
		this.menuitem101 = menuitem101;
	}



	/**
	 * Return the value associated with the column: MENUITEM102
	 */
	public boolean isMenuitem102 () {
		return menuitem102;
	}

	/**
	 * Set the value related to the column: MENUITEM102
	 * @param menuitem102 the MENUITEM102 value
	 */
	public void setMenuitem102 (boolean menuitem102) {
		this.menuitem102 = menuitem102;
	}



	/**
	 * Return the value associated with the column: MENUITEM103
	 */
	public boolean isMenuitem103 () {
		return menuitem103;
	}

	/**
	 * Set the value related to the column: MENUITEM103
	 * @param menuitem103 the MENUITEM103 value
	 */
	public void setMenuitem103 (boolean menuitem103) {
		this.menuitem103 = menuitem103;
	}



	/**
	 * Return the value associated with the column: MENUITEM104
	 */
	public boolean isMenuitem104 () {
		return menuitem104;
	}

	/**
	 * Set the value related to the column: MENUITEM104
	 * @param menuitem104 the MENUITEM104 value
	 */
	public void setMenuitem104 (boolean menuitem104) {
		this.menuitem104 = menuitem104;
	}



	/**
	 * Return the value associated with the column: CODEPAYS
	 */
	public com.artm.hibernate.beans.Pays getCodepays () {
		return codepays;
	}

	/**
	 * Set the value related to the column: CODEPAYS
	 * @param codepays the CODEPAYS value
	 */
	public void setCodepays (com.artm.hibernate.beans.Pays codepays) {
		this.codepays = codepays;
	}



	/**
	 * Return the value associated with the column: USER_ROLE_ID
	 */
	public com.artm.hibernate.beans.UserRole getUserRole () {
		return userRole;
	}

	/**
	 * Set the value related to the column: USER_ROLE_ID
	 * @param userRole the USER_ROLE_ID value
	 */
	public void setUserRole (com.artm.hibernate.beans.UserRole userRole) {
		this.userRole = userRole;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Users)) return false;
		else {
			com.artm.hibernate.beans.Users users = (com.artm.hibernate.beans.Users) obj;
			if (null == this.getId() || null == users.getId()) return false;
			else return (this.getId().equals(users.getId()));
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