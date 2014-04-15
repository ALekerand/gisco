package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the type_matiere_exam table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="type_matiere_exam"
 */

public abstract class BaseTypeMatiereExam  implements Serializable {

	public static String REF = "TypeMatiereExam";
	public static String PROP_LIB_TYPE_EXAM = "LibTypeExam";
	public static String PROP_ID = "Id";


	// constructors
	public BaseTypeMatiereExam () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTypeMatiereExam (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libTypeExam;

	// collections
	private java.util.Set<hibernate.beans.Parammatierexam> parammatierexams;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_TYPE_EXAM"
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
	 * Return the value associated with the column: LIB_TYPE_EXAM
	 */
	public java.lang.String getLibTypeExam () {
		return libTypeExam;
	}

	/**
	 * Set the value related to the column: LIB_TYPE_EXAM
	 * @param libTypeExam the LIB_TYPE_EXAM value
	 */
	public void setLibTypeExam (java.lang.String libTypeExam) {
		this.libTypeExam = libTypeExam;
	}



	/**
	 * Return the value associated with the column: Parammatierexams
	 */
	public java.util.Set<hibernate.beans.Parammatierexam> getParammatierexams () {
		return parammatierexams;
	}

	/**
	 * Set the value related to the column: Parammatierexams
	 * @param parammatierexams the Parammatierexams value
	 */
	public void setParammatierexams (java.util.Set<hibernate.beans.Parammatierexam> parammatierexams) {
		this.parammatierexams = parammatierexams;
	}

	public void addToParammatierexams (hibernate.beans.Parammatierexam parammatierexam) {
		if (null == getParammatierexams()) setParammatierexams(new java.util.TreeSet<hibernate.beans.Parammatierexam>());
		getParammatierexams().add(parammatierexam);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.TypeMatiereExam)) return false;
		else {
			hibernate.beans.TypeMatiereExam typeMatiereExam = (hibernate.beans.TypeMatiereExam) obj;
			if (null == this.getId() || null == typeMatiereExam.getId()) return false;
			else return (this.getId().equals(typeMatiereExam.getId()));
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