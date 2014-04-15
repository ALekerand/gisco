package hibernate.beans;

import hibernate.beans.base.BaseEcolages;



public class Ecolages extends BaseEcolages {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Ecolages () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Ecolages (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Ecolages (
		java.lang.Integer id,
		hibernate.beans.Section codeSection) {

		super (
			id,
			codeSection);
	}

/*[CONSTRUCTOR MARKER END]*/


}