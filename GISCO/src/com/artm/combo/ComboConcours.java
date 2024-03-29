package com.artm.combo;

import java.util.ArrayList;
import java.util.List;

import com.artm.hibernate.beans.Concours;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.objetService.IService;

@Component
@Scope("session")
public class ComboConcours implements Converter {
	
	//Injection de Spring
	@Autowired
	IService service;
	private List <Concours> listeConcours;

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
		for(Object cc :getService().getObjects("Concours")){
			listeConcours.add((Concours) cc);
		}
		return listeConcours;
	}



	public void setListeConcours(List <Concours> listeConcours) {
		this.listeConcours = listeConcours;
	}



	public IService getService() {
		return service;
	}



	public void setService(IService service) {
		this.service = service;
	}



	

}
