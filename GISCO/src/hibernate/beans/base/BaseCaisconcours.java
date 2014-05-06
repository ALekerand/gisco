package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the caisconcours table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="caisconcours"
 */

public abstract class BaseCaisconcours  implements Serializable {

	public static String REF = "Caisconcours";
	public static String PROP_LIB_CAISCONCOURS = "LibCaisconcours";
	public static String PROP_CODE_MODE = "CodeMode";
	public static String PROP_CODE_INSCRIPTION_CONCOURS = "CodeInscriptionConcours";
	public static String PROP_DATE_CAISCONCOURS = "DateCaisconcours";
	public static String PROP_ID = "Id";
	public static String PROP_MONTANT_CAISCONCOURS = "MontantCaisconcours";


	// constructors
	public BaseCaisconcours () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCaisconcours (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCaisconcours (
		java.lang.Integer id,
		hibernate.beans.Inscriptionconcours codeInscriptionConcours,
		hibernate.beans.Mode codeMode) {

		this.setId(id);
		this.setCodeInscriptionConcours(codeInscriptionConcours);
		this.setCodeMode(codeMode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date dateCaisconcours;
	private java.lang.String libCaisconcours;
	private java.math.BigDecimal montantCaisconcours;

	// many to one
	private hibernate.beans.Inscriptionconcours codeInscriptionConcours;
	private hibernate.beans.Mode codeMode;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_CAISCONCOURS"
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
	 * Return the value associated with the column: DATE_CAISCONCOURS
	 */
	public java.util.Date getDateCaisconcours () {
		return dateCaisconcours;
	}

	/**
	 * Set the value related to the column: DATE_CAISCONCOURS
	 * @param dateCaisconcours the DATE_CAISCONCOURS value
	 */
	public void setDateCaisconcours (java.util.Date dateCaisconcours) {
		this.dateCaisconcours = dateCaisconcours;
	}



	/**
	 * Return the value associated with the column: LIB_CAISCONCOURS
	 */
	public java.lang.String getLibCaisconcours () {
		return libCaisconcours;
	}

	/**
	 * Set the value related to the column: LIB_CAISCONCOURS
	 * @param libCaisconcours the LIB_CAISCONCOURS value
	 */
	public void setLibCaisconcours (java.lang.String libCaisconcours) {
		this.libCaisconcours = libCaisconcours;
	}



	/**
	 * Return the value associated with the column: MONTANT_CAISCONCOURS
	 */
	public java.math.BigDecimal getMontantCaisconcours () {
		return montantCaisconcours;
	}

	/**
	 * Set the value related to the column: MONTANT_CAISCONCOURS
	 * @param montantCaisconcours the MONTANT_CAISCONCOURS value
	 */
	public void setMontantCaisconcours (java.math.BigDecimal montantCaisconcours) {
		this.montantCaisconcours = montantCaisconcours;
	}



	/**
	 * Return the value associated with the column: CODE_INSCRIPTION_CONCOURS
	 */
	public hibernate.beans.Inscriptionconcours getCodeInscriptionConcours () {
		return codeInscriptionConcours;
	}

	/**
	 * Set the value related to the column: CODE_INSCRIPTION_CONCOURS
	 * @param codeInscriptionConcours the CODE_INSCRIPTION_CONCOURS value
	 */
	public void setCodeInscriptionConcours (hibernate.beans.Inscriptionconcours codeInscriptionConcours) {
		this.codeInscriptionConcours = codeInscriptionConcours;
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
		if (!(obj instanceof hibernate.beans.Caisconcours)) return false;
		else {
			hibernate.beans.Caisconcours caisconcours = (hibernate.beans.Caisconcours) obj;
			if (null == this.getId() || null == caisconcours.getId()) return false;
			else return (this.getId().equals(caisconcours.getId()));
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