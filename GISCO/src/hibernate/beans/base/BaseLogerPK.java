package hibernate.beans.base;

import java.io.Serializable;


public abstract class BaseLogerPK implements Serializable {

	protected int hashCode = Integer.MIN_VALUE;

	private hibernate.beans.Etudiants numetudiant;
	private hibernate.beans.Logement codeLoge;


	public BaseLogerPK () {}
	
	public BaseLogerPK (
		hibernate.beans.Etudiants numetudiant,
		hibernate.beans.Logement codeLoge) {

		this.setNumetudiant(numetudiant);
		this.setCodeLoge(codeLoge);
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
	 * Return the value associated with the column: CODE_LOGE
	 */
	public hibernate.beans.Logement getCodeLoge () {
		return codeLoge;
	}

	/**
	 * Set the value related to the column: CODE_LOGE
	 * @param codeLoge the CODE_LOGE value
	 */
	public void setCodeLoge (hibernate.beans.Logement codeLoge) {
		this.codeLoge = codeLoge;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.LogerPK)) return false;
		else {
			hibernate.beans.LogerPK mObj = (hibernate.beans.LogerPK) obj;
			if (null != this.getNumetudiant() && null != mObj.getNumetudiant()) {
				if (!this.getNumetudiant().equals(mObj.getNumetudiant())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getCodeLoge() && null != mObj.getCodeLoge()) {
				if (!this.getCodeLoge().equals(mObj.getCodeLoge())) {
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
			if (null != this.getNumetudiant()) {
				sb.append(this.getNumetudiant().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			if (null != this.getCodeLoge()) {
				sb.append(this.getCodeLoge().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			this.hashCode = sb.toString().hashCode();
		}
		return this.hashCode;
	}


}