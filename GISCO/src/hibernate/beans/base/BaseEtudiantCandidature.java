package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the etudiant_candidature table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="etudiant_candidature"
 */

public abstract class BaseEtudiantCandidature  implements Serializable {

	public static String REF = "EtudiantCandidature";
	public static String PROP_ANNEE_CANDIDATURE = "AnneeCandidature";
	public static String PROP_ID = "Id";


	// constructors
	public BaseEtudiantCandidature () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseEtudiantCandidature (hibernate.beans.EtudiantCandidaturePK id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private hibernate.beans.EtudiantCandidaturePK id;

	// fields
	private java.lang.String anneeCandidature;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     */
	public hibernate.beans.EtudiantCandidaturePK getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (hibernate.beans.EtudiantCandidaturePK id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: ANNEE_CANDIDATURE
	 */
	public java.lang.String getAnneeCandidature () {
		return anneeCandidature;
	}

	/**
	 * Set the value related to the column: ANNEE_CANDIDATURE
	 * @param anneeCandidature the ANNEE_CANDIDATURE value
	 */
	public void setAnneeCandidature (java.lang.String anneeCandidature) {
		this.anneeCandidature = anneeCandidature;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.EtudiantCandidature)) return false;
		else {
			hibernate.beans.EtudiantCandidature etudiantCandidature = (hibernate.beans.EtudiantCandidature) obj;
			if (null == this.getId() || null == etudiantCandidature.getId()) return false;
			else return (this.getId().equals(etudiantCandidature.getId()));
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