package managedBeans;

import hibernate.beans.Mode;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Crud;

@ManagedBean
@ViewScoped
public class ManagedModePaiement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Attribut d'instance
	private Crud crud = new Crud();
	private Mode mode = new Mode();
	private List<Mode> listModes;
	
	
	public void enregistrerMode() {
		crud.addObject(mode);
		viderPage();
	}
	
	public void viderPage() {
		mode.setLibMode("");
	}
	

	//***************************ACCESSEURS**********************************//
	public Crud getCrud() {
		return crud;
	}
	public void setCrud(Crud crud) {
		this.crud = crud;
	}
	public Mode getMode() {
		return mode;
	}
	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public List<Mode> getListModes() {
		listModes = crud.getObjects("Mode");
		return listModes;
	}

	public void setListModes(List<Mode> listModes) {
		this.listModes = listModes;
	}
	

}
