package hibernate.beans;

import hibernate.beans.base.BaseCorrespondrePK;

public class CorrespondrePK extends BaseCorrespondrePK {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CorrespondrePK () {}
	
	public CorrespondrePK (
		hibernate.beans.Semestre codeSemestre,
		hibernate.beans.Matiere codeMatiere) {

		super (
			codeSemestre,
			codeMatiere);
	}
/*[CONSTRUCTOR MARKER END]*/


}