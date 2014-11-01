package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the pays table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="pays"
 */

public abstract class BasePays  implements Serializable {

	public static String REF = "Pays";
	public static String PROP_REPUBLIC = "Republic";
	public static String PROP_LIBPAYS = "Libpays";
	public static String PROP_ID = "Id";
	public static String PROP_ABREVPAYS = "Abrevpays";


	// constructors
	public BasePays () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePays (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libpays;
	private java.lang.String republic;
	private java.lang.String abrevpays;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Users> users;
	private java.util.Set<com.artm.hibernate.beans.Candidat> candidats;
	private java.util.Set<com.artm.hibernate.beans.Etudiants> etudiants;
	private java.util.Set<com.artm.hibernate.beans.Anneeconcours> anneeconcours;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODEPAYS"
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
	 * Return the value associated with the column: LIBPAYS
	 */
	public java.lang.String getLibpays () {
		return libpays;
	}

	/**
	 * Set the value related to the column: LIBPAYS
	 * @param libpays the LIBPAYS value
	 */
	public void setLibpays (java.lang.String libpays) {
		this.libpays = libpays;
	}



	/**
	 * Return the value associated with the column: REPUBLIC
	 */
	public java.lang.String getRepublic () {
		return republic;
	}

	/**
	 * Set the value related to the column: REPUBLIC
	 * @param republic the REPUBLIC value
	 */
	public void setRepublic (java.lang.String republic) {
		this.republic = republic;
	}



	/**
	 * Return the value associated with the column: ABREVPAYS
	 */
	public java.lang.String getAbrevpays () {
		return abrevpays;
	}

	/**
	 * Set the value related to the column: ABREVPAYS
	 * @param abrevpays the ABREVPAYS value
	 */
	public void setAbrevpays (java.lang.String abrevpays) {
		this.abrevpays = abrevpays;
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



	/**
	 * Return the value associated with the column: Candidats
	 */
	public java.util.Set<com.artm.hibernate.beans.Candidat> getCandidats () {
		return candidats;
	}

	/**
	 * Set the value related to the column: Candidats
	 * @param candidats the Candidats value
	 */
	public void setCandidats (java.util.Set<com.artm.hibernate.beans.Candidat> candidats) {
		this.candidats = candidats;
	}

	public void addToCandidats (com.artm.hibernate.beans.Candidat candidat) {
		if (null == getCandidats()) setCandidats(new java.util.TreeSet<com.artm.hibernate.beans.Candidat>());
		getCandidats().add(candidat);
	}



	/**
	 * Return the value associated with the column: Etudiants
	 */
	public java.util.Set<com.artm.hibernate.beans.Etudiants> getEtudiants () {
		return etudiants;
	}

	/**
	 * Set the value related to the column: Etudiants
	 * @param etudiants the Etudiants value
	 */
	public void setEtudiants (java.util.Set<com.artm.hibernate.beans.Etudiants> etudiants) {
		this.etudiants = etudiants;
	}

	public void addToEtudiants (com.artm.hibernate.beans.Etudiants etudiants) {
		if (null == getEtudiants()) setEtudiants(new java.util.TreeSet<com.artm.hibernate.beans.Etudiants>());
		getEtudiants().add(etudiants);
	}



	/**
	 * Return the value associated with the column: Anneeconcours
	 */
	public java.util.Set<com.artm.hibernate.beans.Anneeconcours> getAnneeconcours () {
		return anneeconcours;
	}

	/**
	 * Set the value related to the column: Anneeconcours
	 * @param anneeconcours the Anneeconcours value
	 */
	public void setAnneeconcours (java.util.Set<com.artm.hibernate.beans.Anneeconcours> anneeconcours) {
		this.anneeconcours = anneeconcours;
	}

	public void addToAnneeconcours (com.artm.hibernate.beans.Anneeconcours anneeconcours) {
		if (null == getAnneeconcours()) setAnneeconcours(new java.util.TreeSet<com.artm.hibernate.beans.Anneeconcours>());
		getAnneeconcours().add(anneeconcours);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Pays)) return false;
		else {
			com.artm.hibernate.beans.Pays pays = (com.artm.hibernate.beans.Pays) obj;
			if (null == this.getId() || null == pays.getId()) return false;
			else return (this.getId().equals(pays.getId()));
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