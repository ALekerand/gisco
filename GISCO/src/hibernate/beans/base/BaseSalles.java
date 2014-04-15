package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the salles table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="salles"
 */

public abstract class BaseSalles  implements Serializable {

	public static String REF = "Salles";
	public static String PROP_NBRE_PLACE = "NbrePlace";
	public static String PROP_NUM_SALLE = "NumSalle";
	public static String PROP_LIB_SALLE = "LibSalle";
	public static String PROP_ID = "Id";


	// constructors
	public BaseSalles () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSalles (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String numSalle;
	private java.lang.String libSalle;
	private java.lang.Integer nbrePlace;

	// collections
	private java.util.Set<hibernate.beans.Candidat> candidats;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_SALLE"
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
	 * Return the value associated with the column: NUM_SALLE
	 */
	public java.lang.String getNumSalle () {
		return numSalle;
	}

	/**
	 * Set the value related to the column: NUM_SALLE
	 * @param numSalle the NUM_SALLE value
	 */
	public void setNumSalle (java.lang.String numSalle) {
		this.numSalle = numSalle;
	}



	/**
	 * Return the value associated with the column: LIB_SALLE
	 */
	public java.lang.String getLibSalle () {
		return libSalle;
	}

	/**
	 * Set the value related to the column: LIB_SALLE
	 * @param libSalle the LIB_SALLE value
	 */
	public void setLibSalle (java.lang.String libSalle) {
		this.libSalle = libSalle;
	}



	/**
	 * Return the value associated with the column: NBRE_PLACE
	 */
	public java.lang.Integer getNbrePlace () {
		return nbrePlace;
	}

	/**
	 * Set the value related to the column: NBRE_PLACE
	 * @param nbrePlace the NBRE_PLACE value
	 */
	public void setNbrePlace (java.lang.Integer nbrePlace) {
		this.nbrePlace = nbrePlace;
	}



	/**
	 * Return the value associated with the column: Candidats
	 */
	public java.util.Set<hibernate.beans.Candidat> getCandidats () {
		return candidats;
	}

	/**
	 * Set the value related to the column: Candidats
	 * @param candidats the Candidats value
	 */
	public void setCandidats (java.util.Set<hibernate.beans.Candidat> candidats) {
		this.candidats = candidats;
	}

	public void addToCandidats (hibernate.beans.Candidat candidat) {
		if (null == getCandidats()) setCandidats(new java.util.TreeSet<hibernate.beans.Candidat>());
		getCandidats().add(candidat);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Salles)) return false;
		else {
			hibernate.beans.Salles salles = (hibernate.beans.Salles) obj;
			if (null == this.getId() || null == salles.getId()) return false;
			else return (this.getId().equals(salles.getId()));
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