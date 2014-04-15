package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the semestre table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="semestre"
 */

public abstract class BaseSemestre  implements Serializable {

	public static String REF = "Semestre";
	public static String PROP_LIB_SEMESTRE = "LibSemestre";
	public static String PROP_ID = "Id";


	// constructors
	public BaseSemestre () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSemestre (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libSemestre;

	// collections
	private java.util.Set<hibernate.beans.Absence> absences;
	private java.util.Set<hibernate.beans.Notes> notes;
	private java.util.Set<hibernate.beans.Matiere> matieres;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_SEMESTRE"
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
	 * Return the value associated with the column: LIB_SEMESTRE
	 */
	public java.lang.String getLibSemestre () {
		return libSemestre;
	}

	/**
	 * Set the value related to the column: LIB_SEMESTRE
	 * @param libSemestre the LIB_SEMESTRE value
	 */
	public void setLibSemestre (java.lang.String libSemestre) {
		this.libSemestre = libSemestre;
	}



	/**
	 * Return the value associated with the column: Absences
	 */
	public java.util.Set<hibernate.beans.Absence> getAbsences () {
		return absences;
	}

	/**
	 * Set the value related to the column: Absences
	 * @param absences the Absences value
	 */
	public void setAbsences (java.util.Set<hibernate.beans.Absence> absences) {
		this.absences = absences;
	}

	public void addToAbsences (hibernate.beans.Absence absence) {
		if (null == getAbsences()) setAbsences(new java.util.TreeSet<hibernate.beans.Absence>());
		getAbsences().add(absence);
	}



	/**
	 * Return the value associated with the column: Notes
	 */
	public java.util.Set<hibernate.beans.Notes> getNotes () {
		return notes;
	}

	/**
	 * Set the value related to the column: Notes
	 * @param notes the Notes value
	 */
	public void setNotes (java.util.Set<hibernate.beans.Notes> notes) {
		this.notes = notes;
	}

	public void addToNotes (hibernate.beans.Notes notes) {
		if (null == getNotes()) setNotes(new java.util.TreeSet<hibernate.beans.Notes>());
		getNotes().add(notes);
	}



	/**
	 * Return the value associated with the column: Matieres
	 */
	public java.util.Set<hibernate.beans.Matiere> getMatieres () {
		return matieres;
	}

	/**
	 * Set the value related to the column: Matieres
	 * @param matieres the Matieres value
	 */
	public void setMatieres (java.util.Set<hibernate.beans.Matiere> matieres) {
		this.matieres = matieres;
	}

	public void addToMatieres (hibernate.beans.Matiere matiere) {
		if (null == getMatieres()) setMatieres(new java.util.TreeSet<hibernate.beans.Matiere>());
		getMatieres().add(matiere);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Semestre)) return false;
		else {
			hibernate.beans.Semestre semestre = (hibernate.beans.Semestre) obj;
			if (null == this.getId() || null == semestre.getId()) return false;
			else return (this.getId().equals(semestre.getId()));
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