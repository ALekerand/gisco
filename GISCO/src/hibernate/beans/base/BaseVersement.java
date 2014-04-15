package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the versement table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="versement"
 */

public abstract class BaseVersement  implements Serializable {

	public static String REF = "Versement";
	public static String PROP_MONTANT_CAISSE = "MontantCaisse";
	public static String PROP_CODE_ANNEES = "CodeAnnees";
	public static String PROP_CODE_MODE = "CodeMode";
	public static String PROP_DATE_CAISSE = "DateCaisse";
	public static String PROP_NUMETUDIANT = "Numetudiant";
	public static String PROP_CODE_ACTIVITE = "CodeActivite";
	public static String PROP_ID = "Id";
	public static String PROP_LIB_CAISSE = "LibCaisse";
	public static String PROP_CODE_ORIGINR = "CodeOriginr";


	// constructors
	public BaseVersement () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseVersement (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseVersement (
		java.lang.Integer id,
		hibernate.beans.Annees codeAnnees,
		hibernate.beans.Origine codeOriginr,
		hibernate.beans.Activites codeActivite,
		hibernate.beans.Mode codeMode) {

		this.setId(id);
		this.setCodeAnnees(codeAnnees);
		this.setCodeOriginr(codeOriginr);
		this.setCodeActivite(codeActivite);
		this.setCodeMode(codeMode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date dateCaisse;
	private java.lang.String libCaisse;
	private java.math.BigDecimal montantCaisse;

	// many to one
	private hibernate.beans.Etudiants numetudiant;
	private hibernate.beans.Annees codeAnnees;
	private hibernate.beans.Origine codeOriginr;
	private hibernate.beans.Activites codeActivite;
	private hibernate.beans.Mode codeMode;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_VERSEMENT"
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
	 * Return the value associated with the column: DATE_CAISSE
	 */
	public java.util.Date getDateCaisse () {
		return dateCaisse;
	}

	/**
	 * Set the value related to the column: DATE_CAISSE
	 * @param dateCaisse the DATE_CAISSE value
	 */
	public void setDateCaisse (java.util.Date dateCaisse) {
		this.dateCaisse = dateCaisse;
	}



	/**
	 * Return the value associated with the column: LIB_CAISSE
	 */
	public java.lang.String getLibCaisse () {
		return libCaisse;
	}

	/**
	 * Set the value related to the column: LIB_CAISSE
	 * @param libCaisse the LIB_CAISSE value
	 */
	public void setLibCaisse (java.lang.String libCaisse) {
		this.libCaisse = libCaisse;
	}



	/**
	 * Return the value associated with the column: MONTANT_CAISSE
	 */
	public java.math.BigDecimal getMontantCaisse () {
		return montantCaisse;
	}

	/**
	 * Set the value related to the column: MONTANT_CAISSE
	 * @param montantCaisse the MONTANT_CAISSE value
	 */
	public void setMontantCaisse (java.math.BigDecimal montantCaisse) {
		this.montantCaisse = montantCaisse;
	}



	/**
	 * Return the value associated with the column: NUMETUDIANT
	 */
	public hibernate.beans.Etudiants getNumetudiant () {
		return numetudiant;
	}

	/**
	 * Set the value related to the column: NUMETUDIANT
	 * @param numetudiant the NUMETUDIANT value
	 */
	public void setNumetudiant (hibernate.beans.Etudiants numetudiant) {
		this.numetudiant = numetudiant;
	}



	/**
	 * Return the value associated with the column: CODE_ANNEES
	 */
	public hibernate.beans.Annees getCodeAnnees () {
		return codeAnnees;
	}

	/**
	 * Set the value related to the column: CODE_ANNEES
	 * @param codeAnnees the CODE_ANNEES value
	 */
	public void setCodeAnnees (hibernate.beans.Annees codeAnnees) {
		this.codeAnnees = codeAnnees;
	}



	/**
	 * Return the value associated with the column: CODE_ORIGINR
	 */
	public hibernate.beans.Origine getCodeOriginr () {
		return codeOriginr;
	}

	/**
	 * Set the value related to the column: CODE_ORIGINR
	 * @param codeOriginr the CODE_ORIGINR value
	 */
	public void setCodeOriginr (hibernate.beans.Origine codeOriginr) {
		this.codeOriginr = codeOriginr;
	}



	/**
	 * Return the value associated with the column: CODE_ACTIVITE
	 */
	public hibernate.beans.Activites getCodeActivite () {
		return codeActivite;
	}

	/**
	 * Set the value related to the column: CODE_ACTIVITE
	 * @param codeActivite the CODE_ACTIVITE value
	 */
	public void setCodeActivite (hibernate.beans.Activites codeActivite) {
		this.codeActivite = codeActivite;
	}



	/**
	 * Return the value associated with the column: CODE_MODE
	 */
	public hibernate.beans.Mode getCodeMode () {
		return codeMode;
	}

	/**
	 * Set the value related to the column: CODE_MODE
	 * @param codeMode the CODE_MODE value
	 */
	public void setCodeMode (hibernate.beans.Mode codeMode) {
		this.codeMode = codeMode;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Versement)) return false;
		else {
			hibernate.beans.Versement versement = (hibernate.beans.Versement) obj;
			if (null == this.getId() || null == versement.getId()) return false;
			else return (this.getId().equals(versement.getId()));
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