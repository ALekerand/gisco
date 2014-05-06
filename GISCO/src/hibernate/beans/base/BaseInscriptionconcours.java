package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the inscriptionconcours table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="inscriptionconcours"
 */

public abstract class BaseInscriptionconcours  implements Serializable {

	public static String REF = "Inscriptionconcours";
	public static String PROP_DATE_INSCRIPTION_CONCOURS = "DateInscriptionConcours";
	public static String PROP_NUM_CANDIDAT = "NumCandidat";
	public static String PROP_CODE_CONCOURS = "CodeConcours";
	public static String PROP_CODE_ANNEES_CONCOURS = "CodeAnneesConcours";
	public static String PROP_ID = "Id";
	public static String PROP_SOLDE = "Solde";


	// constructors
	public BaseInscriptionconcours () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseInscriptionconcours (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseInscriptionconcours (
		java.lang.Integer id,
		hibernate.beans.Anneeconcours codeAnneesConcours,
		hibernate.beans.Candidat numCandidat,
		hibernate.beans.Concours codeConcours) {

		this.setId(id);
		this.setCodeAnneesConcours(codeAnneesConcours);
		this.setNumCandidat(numCandidat);
		this.setCodeConcours(codeConcours);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date dateInscriptionConcours;
	private boolean solde;

	// many to one
	private hibernate.beans.Anneeconcours codeAnneesConcours;
	private hibernate.beans.Candidat numCandidat;
	private hibernate.beans.Concours codeConcours;

	// collections
	private java.util.Set<hibernate.beans.Caisconcours> caisconcours;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_INSCRIPTION_CONCOURS"
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
	 * Return the value associated with the column: DATE_INSCRIPTION_CONCOURS
	 */
	public java.util.Date getDateInscriptionConcours () {
		return dateInscriptionConcours;
	}

	/**
	 * Set the value related to the column: DATE_INSCRIPTION_CONCOURS
	 * @param dateInscriptionConcours the DATE_INSCRIPTION_CONCOURS value
	 */
	public void setDateInscriptionConcours (java.util.Date dateInscriptionConcours) {
		this.dateInscriptionConcours = dateInscriptionConcours;
	}



	/**
	 * Return the value associated with the column: SOLDE
	 */
	public boolean isSolde () {
		return solde;
	}

	/**
	 * Set the value related to the column: SOLDE
	 * @param solde the SOLDE value
	 */
	public void setSolde (boolean solde) {
		this.solde = solde;
	}



	/**
	 * Return the value associated with the column: CODE_ANNEES_CONCOURS
	 */
	public hibernate.beans.Anneeconcours getCodeAnneesConcours () {
		return codeAnneesConcours;
	}

	/**
	 * Set the value related to the column: CODE_ANNEES_CONCOURS
	 * @param codeAnneesConcours the CODE_ANNEES_CONCOURS value
	 */
	public void setCodeAnneesConcours (hibernate.beans.Anneeconcours codeAnneesConcours) {
		this.codeAnneesConcours = codeAnneesConcours;
	}



	/**
	 * Return the value associated with the column: NUM_CANDIDAT
	 */
	public hibernate.beans.Candidat getNumCandidat () {
		return numCandidat;
	}

	/**
	 * Set the value related to the column: NUM_CANDIDAT
	 * @param numCandidat the NUM_CANDIDAT value
	 */
	public void setNumCandidat (hibernate.beans.Candidat numCandidat) {
		this.numCandidat = numCandidat;
	}



	/**
	 * Return the value associated with the column: CODE_CONCOURS
	 */
	public hibernate.beans.Concours getCodeConcours () {
		return codeConcours;
	}

	/**
	 * Set the value related to the column: CODE_CONCOURS
	 * @param codeConcours the CODE_CONCOURS value
	 */
	public void setCodeConcours (hibernate.beans.Concours codeConcours) {
		this.codeConcours = codeConcours;
	}



	/**
	 * Return the value associated with the column: Caisconcours
	 */
	public java.util.Set<hibernate.beans.Caisconcours> getCaisconcours () {
		return caisconcours;
	}

	/**
	 * Set the value related to the column: Caisconcours
	 * @param caisconcours the Caisconcours value
	 */
	public void setCaisconcours (java.util.Set<hibernate.beans.Caisconcours> caisconcours) {
		this.caisconcours = caisconcours;
	}

	public void addToCaisconcours (hibernate.beans.Caisconcours caisconcours) {
		if (null == getCaisconcours()) setCaisconcours(new java.util.TreeSet<hibernate.beans.Caisconcours>());
		getCaisconcours().add(caisconcours);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Inscriptionconcours)) return false;
		else {
			hibernate.beans.Inscriptionconcours inscriptionconcours = (hibernate.beans.Inscriptionconcours) obj;
			if (null == this.getId() || null == inscriptionconcours.getId()) return false;
			else return (this.getId().equals(inscriptionconcours.getId()));
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