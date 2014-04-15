package hibernate.beans;

import hibernate.beans.base.BaseMatiereconcours;



public class Matiereconcours extends BaseMatiereconcours {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Matiereconcours () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Matiereconcours (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Matiereconcours (
		java.lang.Integer id,
		hibernate.beans.Typematiereconcours codeTypeMatiere,
		hibernate.beans.Concours codeConcours) {

		super (
			id,
			codeTypeMatiere,
			codeConcours);
	}

/*[CONSTRUCTOR MARKER END]*/


}