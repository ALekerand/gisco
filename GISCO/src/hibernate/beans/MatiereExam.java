package hibernate.beans;

import hibernate.beans.base.BaseMatiereExam;



public class MatiereExam extends BaseMatiereExam {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public MatiereExam () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public MatiereExam (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public MatiereExam (
		java.lang.Integer id,
		hibernate.beans.Section codeSection) {

		super (
			id,
			codeSection);
	}

/*[CONSTRUCTOR MARKER END]*/


}