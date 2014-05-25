package combo;

import hibernate.beans.Diplomes;
import hibernate.beans.Niveaux;
import java.util.ArrayList;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import objetService.IService;

@Component
@Scope("session")
public class ComboDiplome implements Converter {
	//Injection de Spring
	@Autowired
	IService service;
	
	private List <Diplomes> listeDiplome;

	
	

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String submiString) {
		// TODO Stub de la méthode généré automatiquement
		if(submiString.trim().equals("")){
			return null;
		}else{
			for(Diplomes dp: getListeDiplome()){
				if(dp.getLibDiplome().equals(submiString))
					return dp;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		// TODO Stub de la méthode généré automatiquement
		if(value == null || value.equals("") ){
			return "";
		}else{
			
				return ((Diplomes) value).getLibDiplome();
		}
	}

	public List <Diplomes> getListeDiplome() {
		listeDiplome = new ArrayList<>();
		for(Object dp :getService().getObjects("Diplomes")){
			listeDiplome.add((Diplomes) dp);
		}
		return listeDiplome;
	}

	public void setListeDiplome(List <Diplomes> listeDiplome) {
		this.listeDiplome = listeDiplome;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

}
