package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseEtudiantCandidaturePK;

public class EtudiantCandidaturePK extends BaseEtudiantCandidaturePK {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public EtudiantCandidaturePK () {}
	
	public EtudiantCandidaturePK (
		com.artm.hibernate.beans.Etudiants numetudiant,
		com.artm.hibernate.beans.Candidature codeCandidature) {

		super (
			numetudiant,
			codeCandidature);
	}
/*[CONSTRUCTOR MARKER END]*/


}