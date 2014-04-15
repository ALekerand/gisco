package hibernate.beans.base;

import java.io.Serializable;


public abstract class BaseCorrespondrePK implements Serializable {

	protected int hashCode = Integer.MIN_VALUE;

	private hibernate.beans.Semestre codeSemestre;
	private hibernate.beans.Matiere codeMatiere;


	public BaseCorrespondrePK () {}
	
	public BaseCorrespondrePK (
		hibernate.beans.Semestre codeSemestre,
		hibernate.beans.Matiere codeMatiere) {

		this.setCodeSemestre(codeSemestre);
		this.setCodeMatiere(codeMatiere);
	}


	/**
	 * Return the value associated with the column: CODE_SEMESTRE
	 */
	public hibernate.beans.Semestre getCodeSemestre () {
		return codeSemestre;
	}

	/**
	 * Set the value related to the column: CODE_SEMESTRE
	 * @param codeSemestre the CODE_SEMESTRE value
	 */
	public void setCodeSemestre (hibernate.beans.Semestre codeSemestre) {
		this.codeSemestre = codeSemestre;
	}



	/**
	 * Return the value associated with the column: CODE_MATIERE
	 */
	public hibernate.beans.Matiere getCodeMatiere () {
		return codeMatiere;
	}

	/**
	 * Set the value related to the column: CODE_MATIERE
	 * @param codeMatiere the CODE_MATIERE value
	 */
	public void setCodeMatiere (hibernate.beans.Matiere codeMatiere) {
		this.codeMatiere = codeMatiere;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.CorrespondrePK)) return false;
		else {
			hibernate.beans.CorrespondrePK mObj = (hibernate.beans.CorrespondrePK) obj;
			if (null != this.getCodeSemestre() && null != mObj.getCodeSemestre()) {
				if (!this.getCodeSemestre().equals(mObj.getCodeSemestre())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getCodeMatiere() && null != mObj.getCodeMatiere()) {
				if (!this.getCodeMatiere().equals(mObj.getCodeMatiere())) {
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
			if (null != this.getCodeSemestre()) {
				sb.append(this.getCodeSemestre().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			if (null != this.getCodeMatiere()) {
				sb.append(this.getCodeMatiere().hashCode());
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