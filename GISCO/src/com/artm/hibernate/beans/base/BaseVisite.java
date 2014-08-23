package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the visite table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="visite"
 */

public abstract class BaseVisite  implements Serializable {

	public static String REF = "Visite";
	public static String PROP_NUM_CANDIDAT = "NumCandidat";
	public static String PROP_ID = "Id";
	public static String PROP_MONTANT_VISITE = "MontantVisite";


	// constructors
	public BaseVisite () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseVisite (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseVisite (
		java.lang.Integer id,
		com.artm.hibernate.beans.Candidat numCandidat) {

		this.setId(id);
		this.setNumCandidat(numCandidat);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.math.BigDecimal montantVisite;

	// many to one
	private com.artm.hibernate.beans.Candidat numCandidat;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Candidat> candidats;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="NUM_VISTE"
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
	 * Return the value associated with the column: MONTANT_VISITE
	 */
	public java.math.BigDecimal getMontantVisite () {
		return montantVisite;
	}

	/**
	 * Set the value related to the column: MONTANT_VISITE
	 * @param montantVisite the MONTANT_VISITE value
	 */
	public void setMontantVisite (java.math.BigDecimal montantVisite) {
		this.montantVisite = montantVisite;
	}



	/**
	 * Return the value associated with the column: NUM_CANDIDAT
	 */
	public com.artm.hibernate.beans.Candidat getNumCandidat () {
		return numCandidat;
	}

	/**
	 * Set the value related to the column: NUM_CANDIDAT
	 * @param numCandidat the NUM_CANDIDAT value
	 */
	public void setNumCandidat (com.artm.hibernate.beans.Candidat numCandidat) {
		this.numCandidat = numCandidat;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Visite)) return false;
		else {
			com.artm.hibernate.beans.Visite visite = (com.artm.hibernate.beans.Visite) obj;
			if (null == this.getId() || null == visite.getId()) return false;
			else return (this.getId().equals(visite.getId()));
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