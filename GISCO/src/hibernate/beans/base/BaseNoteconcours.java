package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the noteconcours table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="noteconcours"
 */

public abstract class BaseNoteconcours  implements Serializable {

	public static String REF = "Noteconcours";
	public static String PROP_NUM_CANDIDAT = "NumCandidat";
	public static String PROP_DATE_NOTE_CONCOURS = "DateNoteConcours";
	public static String PROP_CODE_MATIERE_CONCOURS = "CodeMatiereConcours";
	public static String PROP_NOTE_CONCOURS = "NoteConcours";
	public static String PROP_ID = "Id";


	// constructors
	public BaseNoteconcours () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseNoteconcours (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseNoteconcours (
		java.lang.Integer id,
		hibernate.beans.Candidat numCandidat,
		hibernate.beans.Matiereconcours codeMatiereConcours) {

		this.setId(id);
		this.setNumCandidat(numCandidat);
		this.setCodeMatiereConcours(codeMatiereConcours);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.math.BigDecimal noteConcours;
	private java.util.Date dateNoteConcours;

	// many to one
	private hibernate.beans.Candidat numCandidat;
	private hibernate.beans.Matiereconcours codeMatiereConcours;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_NOTE_CONCOURS"
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
	 * Return the value associated with the column: NOTE_CONCOURS
	 */
	public java.math.BigDecimal getNoteConcours () {
		return noteConcours;
	}

	/**
	 * Set the value related to the column: NOTE_CONCOURS
	 * @param noteConcours the NOTE_CONCOURS value
	 */
	public void setNoteConcours (java.math.BigDecimal noteConcours) {
		this.noteConcours = noteConcours;
	}



	/**
	 * Return the value associated with the column: DATE_NOTE_CONCOURS
	 */
	public java.util.Date getDateNoteConcours () {
		return dateNoteConcours;
	}

	/**
	 * Set the value related to the column: DATE_NOTE_CONCOURS
	 * @param dateNoteConcours the DATE_NOTE_CONCOURS value
	 */
	public void setDateNoteConcours (java.util.Date dateNoteConcours) {
		this.dateNoteConcours = dateNoteConcours;
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
	 * Return the value associated with the column: CODE_MATIERE_CONCOURS
	 */
	public hibernate.beans.Matiereconcours getCodeMatiereConcours () {
		return codeMatiereConcours;
	}

	/**
	 * Set the value related to the column: CODE_MATIERE_CONCOURS
	 * @param codeMatiereConcours the CODE_MATIERE_CONCOURS value
	 */
	public void setCodeMatiereConcours (hibernate.beans.Matiereconcours codeMatiereConcours) {
		this.codeMatiereConcours = codeMatiereConcours;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Noteconcours)) return false;
		else {
			hibernate.beans.Noteconcours noteconcours = (hibernate.beans.Noteconcours) obj;
			if (null == this.getId() || null == noteconcours.getId()) return false;
			else return (this.getId().equals(noteconcours.getId()));
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