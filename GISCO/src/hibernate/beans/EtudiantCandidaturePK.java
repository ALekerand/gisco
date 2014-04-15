package hibernate.beans;

import hibernate.beans.base.BaseEtudiantCandidaturePK;

public class EtudiantCandidaturePK extends BaseEtudiantCandidaturePK {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public EtudiantCandidaturePK () {}
	
	public EtudiantCandidaturePK (
		hibernate.beans.Etudiants numetudiant,
		hibernate.beans.Candidature codeCandidature) {

		super (
			numetudiant,
			codeCandidature);
	}
/*[CONSTRUCTOR MARKER END]*/


}