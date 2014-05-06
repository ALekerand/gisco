package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the concours table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="concours"
 */

public abstract class BaseConcours  implements Serializable {

	public static String REF = "Concours";
	public static String PROP_ABREV_OBTENTION_DIPLOME = "AbrevObtentionDiplome";
	public static String PROP_ABREV_ECOLE_CONCOURS = "AbrevEcoleConcours";
	public static String PROP_LIB_ECOLE_CONCOURS = "LibEcoleConcours";
	public static String PROP_ID = "Id";
	public static String PROP_OBTENTION_DIPLOME = "ObtentionDiplome";
	public static String PROP_LIB_CONCOURS = "LibConcours";


	// constructors
	public BaseConcours () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseConcours (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libConcours;
	private java.lang.String libEcoleConcours;
	private java.lang.String abrevEcoleConcours;
	private java.lang.String abrevObtentionDiplome;
	private java.lang.String obtentionDiplome;

	// collections
	private java.util.Set<hibernate.beans.Inscriptionconcours> inscriptionconcours;
	private java.util.Set<hibernate.beans.Matiereconcours> matiereconcours;
	private java.util.Set<hibernate.beans.Anneeconcours> anneeconcours;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_CONCOURS"
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
	 * Return the value associated with the column: LIB_CONCOURS
	 */
	public java.lang.String getLibConcours () {
		return libConcours;
	}

	/**
	 * Set the value related to the column: LIB_CONCOURS
	 * @param libConcours the LIB_CONCOURS value
	 */
	public void setLibConcours (java.lang.String libConcours) {
		this.libConcours = libConcours;
	}



	/**
	 * Return the value associated with the column: LIB_ECOLE_CONCOURS
	 */
	public java.lang.String getLibEcoleConcours () {
		return libEcoleConcours;
	}

	/**
	 * Set the value related to the column: LIB_ECOLE_CONCOURS
	 * @param libEcoleConcours the LIB_ECOLE_CONCOURS value
	 */
	public void setLibEcoleConcours (java.lang.String libEcoleConcours) {
		this.libEcoleConcours = libEcoleConcours;
	}



	/**
	 * Return the value associated with the column: ABREV_ECOLE_CONCOURS
	 */
	public java.lang.String getAbrevEcoleConcours () {
		return abrevEcoleConcours;
	}

	/**
	 * Set the value related to the column: ABREV_ECOLE_CONCOURS
	 * @param abrevEcoleConcours the ABREV_ECOLE_CONCOURS value
	 */
	public void setAbrevEcoleConcours (java.lang.String abrevEcoleConcours) {
		this.abrevEcoleConcours = abrevEcoleConcours;
	}



	/**
	 * Return the value associated with the column: ABREV_OBTENTION_DIPLOME
	 */
	public java.lang.String getAbrevObtentionDiplome () {
		return abrevObtentionDiplome;
	}

	/**
	 * Set the value related to the column: ABREV_OBTENTION_DIPLOME
	 * @param abrevObtentionDiplome the ABREV_OBTENTION_DIPLOME value
	 */
	public void setAbrevObtentionDiplome (java.lang.String abrevObtentionDiplome) {
		this.abrevObtentionDiplome = abrevObtentionDiplome;
	}



	/**
	 * Return the value associated with the column: OBTENTION_DIPLOME
	 */
	public java.lang.String getObtentionDiplome () {
		return obtentionDiplome;
	}

	/**
	 * Set the value related to the column: OBTENTION_DIPLOME
	 * @param obtentionDiplome the OBTENTION_DIPLOME value
	 */
	public void setObtentionDiplome (java.lang.String obtentionDiplome) {
		this.obtentionDiplome = obtentionDiplome;
	}



	/**
	 * Return the value associated with the column: Inscriptionconcours
	 */
	public java.util.Set<hibernate.beans.Inscriptionconcours> getInscriptionconcours () {
		return inscriptionconcours;
	}

	/**
	 * Set the value related to the column: Inscriptionconcours
	 * @param inscriptionconcours the Inscriptionconcours value
	 */
	public void setInscriptionconcours (java.util.Set<hibernate.beans.Inscriptionconcours> inscriptionconcours) {
		this.inscriptionconcours = inscriptionconcours;
	}

	public void addToInscriptionconcours (hibernate.beans.Inscriptionconcours inscriptionconcours) {
		if (null == getInscriptionconcours()) setInscriptionconcours(new java.util.TreeSet<hibernate.beans.Inscriptionconcours>());
		getInscriptionconcours().add(inscriptionconcours);
	}



	/**
	 * Return the value associated with the column: Matiereconcours
	 */
	public java.util.Set<hibernate.beans.Matiereconcours> getMatiereconcours () {
		return matiereconcours;
	}

	/**
	 * Set the value related to the column: Matiereconcours
	 * @param matiereconcours the Matiereconcours value
	 */
	public void setMatiereconcours (java.util.Set<hibernate.beans.Matiereconcours> matiereconcours) {
		this.matiereconcours = matiereconcours;
	}

	public void addToMatiereconcours (hibernate.beans.Matiereconcours matiereconcours) {
		if (null == getMatiereconcours()) setMatiereconcours(new java.util.TreeSet<hibernate.beans.Matiereconcours>());
		getMatiereconcours().add(matiereconcours);
	}



	/**
	 * Return the value associated with the column: Anneeconcours
	 */
	public java.util.Set<hibernate.beans.Anneeconcours> getAnneeconcours () {
		return anneeconcours;
	}

	/**
	 * Set the value related to the column: Anneeconcours
	 * @param anneeconcours the Anneeconcours value
	 */
	public void setAnneeconcours (java.util.Set<hibernate.beans.Anneeconcours> anneeconcours) {
		this.anneeconcours = anneeconcours;
	}

	public void addToAnneeconcours (hibernate.beans.Anneeconcours anneeconcours) {
		if (null == getAnneeconcours()) setAnneeconcours(new java.util.TreeSet<hibernate.beans.Anneeconcours>());
		getAnneeconcours().add(anneeconcours);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Concours)) return false;
		else {
			hibernate.beans.Concours concours = (hibernate.beans.Concours) obj;
			if (null == this.getId() || null == concours.getId()) return false;
			else return (this.getId().equals(concours.getId()));
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