package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the paramvisite table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="paramvisite"
 */

public abstract class BaseParamvisite  implements Serializable {

	public static String REF = "Paramvisite";
	public static String PROP_ANNEE_VISITE = "AnneeVisite";
	public static String PROP_ID = "Id";
	public static String PROP_MONTANT_PARAM_VISITE = "MontantParamVisite";


	// constructors
	public BaseParamvisite () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseParamvisite (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String anneeVisite;
	private java.math.BigDecimal montantParamVisite;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_PARAMA_VISITE"
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
	 * Return the value associated with the column: ANNEE_VISITE
	 */
	public java.lang.String getAnneeVisite () {
		return anneeVisite;
	}

	/**
	 * Set the value related to the column: ANNEE_VISITE
	 * @param anneeVisite the ANNEE_VISITE value
	 */
	public void setAnneeVisite (java.lang.String anneeVisite) {
		this.anneeVisite = anneeVisite;
	}



	/**
	 * Return the value associated with the column: MONTANT_PARAM_VISITE
	 */
	public java.math.BigDecimal getMontantParamVisite () {
		return montantParamVisite;
	}

	/**
	 * Set the value related to the column: MONTANT_PARAM_VISITE
	 * @param montantParamVisite the MONTANT_PARAM_VISITE value
	 */
	public void setMontantParamVisite (java.math.BigDecimal montantParamVisite) {
		this.montantParamVisite = montantParamVisite;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Paramvisite)) return false;
		else {
			com.artm.hibernate.beans.Paramvisite paramvisite = (com.artm.hibernate.beans.Paramvisite) obj;
			if (null == this.getId() || null == paramvisite.getId()) return false;
			else return (this.getId().equals(paramvisite.getId()));
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