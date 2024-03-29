package com.artm.hibernate.beans.base;

import java.io.Serializable;


public abstract class BaseEtudiantCandidaturePK implements Serializable {

	protected int hashCode = Integer.MIN_VALUE;

	private com.artm.hibernate.beans.Etudiants numetudiant;
	private com.artm.hibernate.beans.Candidature codeCandidature;


	public BaseEtudiantCandidaturePK () {}
	
	public BaseEtudiantCandidaturePK (
		com.artm.hibernate.beans.Etudiants numetudiant,
		com.artm.hibernate.beans.Candidature codeCandidature) {

		this.setNumetudiant(numetudiant);
		this.setCodeCandidature(codeCandidature);
	}


	/**
	 * Return the value associated with the column: NUMETUDIANT
	 */
	public com.artm.hibernate.beans.Etudiants getNumetudiant () {
		return numetudiant;
	}

	/**
	 * Set the value related to the column: NUMETUDIANT
	 * @param numetudiant the NUMETUDIANT value
	 */
	public void setNumetudiant (com.artm.hibernate.beans.Etudiants numetudiant) {
		this.numetudiant = numetudiant;
	}



	/**
	 * Return the value associated with the column: CODE_CANDIDATURE
	 */
	public com.artm.hibernate.beans.Candidature getCodeCandidature () {
		return codeCandidature;
	}

	/**
	 * Set the value related to the column: CODE_CANDIDATURE
	 * @param codeCandidature the CODE_CANDIDATURE value
	 */
	public void setCodeCandidature (com.artm.hibernate.beans.Candidature codeCandidature) {
		this.codeCandidature = codeCandidature;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.EtudiantCandidaturePK)) return false;
		else {
			com.artm.hibernate.beans.EtudiantCandidaturePK mObj = (com.artm.hibernate.beans.EtudiantCandidaturePK) obj;
			if (null != this.getNumetudiant() && null != mObj.getNumetudiant()) {
				if (!this.getNumetudiant().equals(mObj.getNumetudiant())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getCodeCandidature() && null != mObj.getCodeCandidature()) {
				if (!this.getCodeCandidature().equals(mObj.getCodeCandidature())) {
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
			if (null != this.getCodeCandidature()) {
				sb.append(this.getCodeCandidature().hashCode());
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