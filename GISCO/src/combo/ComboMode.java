package combo;

import hibernate.beans.Mode;
import hibernate.beans.Sexes;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import objetService.IService;


@Component
@Scope("session")
public class ComboMode implements Converter {
	// Injection de Spring
	@Autowired
	IService service;
	
	private List<Mode> listModes;

	public ComboMode() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String comboValue) {
		// TODO Auto-generated method stub
		if(comboValue.trim().equals("")){
			return null;
		}else{
			for(Mode md:listModes){
				if(md.getLibMode().equals(comboValue))
					return md;
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

	public List<Mode> getListModes() {
		listModes = new ArrayList<Mode>();
		for(Object md:getService().getObjects("Mode")){
			listModes.add((Mode) md);
		}
		return listModes;
	}

	public void setListModes(List<Mode> listModes) {
		this.listModes = listModes;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}
	

}
