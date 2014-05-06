package hibernate.beans;

import hibernate.beans.base.BaseAnneeconcours;



public class Anneeconcours extends BaseAnneeconcours {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Anneeconcours () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Anneeconcours (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Anneeconcours (
		java.lang.Integer id,
		hibernate.beans.Pays codepays,
		hibernate.beans.Concours codeConcours) {

		super (
			id,
			codepays,
			codeConcours);
	}

/*[CONSTRUCTOR MARKER END]*/


}