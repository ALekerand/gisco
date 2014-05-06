package managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import dao.Crud;
import dataModel.SexeModel;
import hibernate.beans.Sexes;


public class manageSexe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Sexes monSexe = new Sexes();
	private Crud monCrud = new Crud();
	private SexeModel monSexeModel;
	private List listeSexe = new ArrayList<>();

	
	public void enregistrerSexe(){
		getMonCrud().addObject(monSexe);
		
		
	}
	
	
	public List chargerToutSexe(){
		setListeSexe(monCrud.getObjects("Sexe"));
		return listeSexe;
	}
// geters et seters

	public Sexes getMonSexe() {
		return monSexe;
	}


	public void setMonSexe(Sexes monSexe) {
		this.monSexe = monSexe;
	}

	public Crud getMonCrud() {
		return monCrud;
	}

	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}

	public List getListeSexe() {
		return listeSexe;
	}

	public void setListeSexe(List listeSexe) {
		this.listeSexe = listeSexe;
	}

	public SexeModel getMonSexeModel() {
		monSexeModel = new SexeModel();
		return monSexeModel;
	}

	public void setMonSexeModel(SexeModel monSexeModel) {
		this.monSexeModel = monSexeModel;
	}

}
