package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseCorrespondrePK;

public class CorrespondrePK extends BaseCorrespondrePK {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CorrespondrePK () {}
	
	public CorrespondrePK (
		com.artm.hibernate.beans.Semestre codeSemestre,
		com.artm.hibernate.beans.Matiere codeMatiere) {

		super (
			codeSemestre,
			codeMatiere);
	}
/*[CONSTRUCTOR MARKER END]*/


}