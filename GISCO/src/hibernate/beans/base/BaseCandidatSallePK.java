package hibernate.beans.base;

import java.io.Serializable;


public abstract class BaseCandidatSallePK implements Serializable {

	protected int hashCode = Integer.MIN_VALUE;

	private hibernate.beans.Salles codeSalle;
	private hibernate.beans.Candidat numCandidat;


	public BaseCandidatSallePK () {}
	
	public BaseCandidatSallePK (
		hibernate.beans.Salles codeSalle,
		hibernate.beans.Candidat numCandidat) {

		this.setCodeSalle(codeSalle);
		this.setNumCandidat(numCandidat);
	}


	/**
	 * Return the value associated with the column: CODE_SALLE
	 */
	public hibernate.beans.Salles getCodeSalle () {
		return codeSalle;
	}

	/**
	 * Set the value related to the column: CODE_SALLE
	 * @param codeSalle the CODE_SALLE value
	 */
	public void setCodeSalle (hibernate.beans.Salles codeSalle) {
		this.codeSalle = codeSalle;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.CandidatSallePK)) return false;
		else {
			hibernate.beans.CandidatSallePK mObj = (hibernate.beans.CandidatSallePK) obj;
			if (null != this.getCodeSalle() && null != mObj.getCodeSalle()) {
				if (!this.getCodeSalle().equals(mObj.getCodeSalle())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getNumCandidat() && null != mObj.getNumCandidat()) {
				if (!this.getNumCandidat().equals(mObj.getNumCandidat())) {
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
			if (null != this.getCodeSalle()) {
				sb.append(this.getCodeSalle().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			if (null != this.getNumCandidat()) {
				sb.append(this.getNumCandidat().hashCode());
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