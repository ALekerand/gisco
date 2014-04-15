package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the avoir table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="avoir"
 */

public abstract class BaseAvoir  implements Serializable {

	public static String REF = "Avoir";


	// constructors
	public BaseAvoir () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAvoir (
		hibernate.beans.Sexes codesexe,
		hibernate.beans.Etudiants numetudiant) {

		this.setCodesexe(codesexe);
		this.setNumetudiant(numetudiant);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key

	private hibernate.beans.Sexes codesexe;

	private hibernate.beans.Etudiants numetudiant;



	/**
     * @hibernate.property
     *  column=CODESEXE
	 * not-null=true
	 */
	public hibernate.beans.Sexes getCodesexe () {
		return this.codesexe;
	}

	/**
	 * Set the value related to the column: CODESEXE
	 * @param codesexe the CODESEXE value
	 */
	public void setCodesexe (hibernate.beans.Sexes codesexe) {
		this.codesexe = codesexe;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
     * @hibernate.property
     *  column=NUMETUDIANT
	 * not-null=true
	 */
	public hibernate.beans.Etudiants getNumetudiant () {
		return this.numetudiant;
	}

	/**
	 * Set the value related to the column: NUMETUDIANT
	 * @param numetudiant the NUMETUDIANT value
	 */
	public void setNumetudiant (hibernate.beans.Etudiants numetudiant) {
		this.numetudiant = numetudiant;
		this.hashCode = Integer.MIN_VALUE;
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Avoir)) return false;
		else {
			hibernate.beans.Avoir avoir = (hibernate.beans.Avoir) obj;
			if (null != this.getCodesexe() && null != avoir.getCodesexe()) {
				if (!this.getCodesexe().equals(avoir.getCodesexe())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getNumetudiant() && null != avoir.getNumetudiant()) {
				if (!this.getNumetudiant().equals(avoir.getNumetudiant())) {
					return false;
				}
			}
			else {
				return false;
			}
			return true;
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			StringBuilder sb = new StringBuilder();
			if (null != this.getCodesexe()) {
				sb.append(this.getCodesexe().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			if (null != this.getNumetudiant()) {
				sb.append(this.getNumetudiant().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			this.hashCode = sb.toString().hashCode();
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}