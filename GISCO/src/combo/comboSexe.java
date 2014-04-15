package combo;

import hibernate.beans.Sexes;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import dao.Crud;

public class comboSexe implements Converter {
	private Crud monCrud = new Crud();
	private List<Sexes> listeSexe;

	public comboSexe() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String comboValue) {
		// TODO Auto-generated method stub
		if(comboValue.trim().equals("")){
			return null;
		}else{
			for(Sexes ec:listeSexe){
				if(ec.getLibsexe().equals(comboValue))
					return ec;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		
		
		return null;
	}
	
	//Getters and Setters

	public Crud getMonCrud() {
		return monCrud;
	}

	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}

	public List getListeSexe() {
		listeSexe = new ArrayList<Sexes>();
		for(Object ec:getMonCrud().getObjects("Sexes")){
			listeSexe.add((Sexes) ec);
		}
		return listeSexe;
	}

	public void setListeSexe(List listeSexe) {
		this.listeSexe = listeSexe;
	}

}
