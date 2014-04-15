package combo;

import java.util.ArrayList;
import java.util.List;

import hibernate.beans.Concours;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import dao.Crud;

public class ComboConcours implements Converter {
	private List <Concours> listeConcours;
	private Crud monCrud = new Crud();

	public ComboConcours() {
		// TODO Auto-generated constructor stub
		
	}
	
	

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String submiString) {
		// TODO Auto-generated method stub
		if(submiString.trim().equals("")){
			return null;
		}else{
			for(Concours cc: getListeConcours()){
				if(cc.getAbrevObtentionDiplome().equals(submiString))
					return cc;
			}
		}
		return null;
	
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		return null;
	}

//*********************Accesseurs*******************//

	public List <Concours> getListeConcours() {
		listeConcours = new ArrayList<>();
		for(Object cc :getMonCrud().getObjects("Concours")){
			listeConcours.add((Concours) cc);
		}
		return listeConcours;
	}



	public void setListeConcours(List <Concours> listeConcours) {
		this.listeConcours = listeConcours;
	}



	public Crud getMonCrud() {
		return monCrud;
	}



	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}

}
