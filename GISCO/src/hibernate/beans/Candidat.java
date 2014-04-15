package hibernate.beans;

import hibernate.beans.base.BaseCandidat;



public class Candidat extends BaseCandidat {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Candidat () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Candidat (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Candidat (
		java.lang.Integer id,
		hibernate.beans.Nationalites codenationalite,
		hibernate.beans.Pays codepays,
		hibernate.beans.Sexes codesexe,
		hibernate.beans.Niveaux codeniveau,
		hibernate.beans.Diplomes codeDiplome) {

		super (
			id,
			codenationalite,
			codepays,
			codesexe,
			codeniveau,
			codeDiplome);
	}

/*[CONSTRUCTOR MARKER END]*/


}