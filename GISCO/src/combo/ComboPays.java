package combo;

import hibernate.beans.Pays;
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
public class ComboPays implements Converter {
	// Injection de Spring
	@Autowired
	IService service;
	private List<Pays> listePays;
	

	public ComboPays() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String comboValue) {
		// TODO Auto-generated method stub
		if(comboValue.trim().equals("")){
			return null;
		}else{
			for(Pays ec:listePays){
				if(ec.getLibpays().equals(comboValue))
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
	
	// *******************Accesseurs******************************

	public List getListePays() {
		listePays = new ArrayList<Pays>();
		for(Object ec:getService().getObjects("Pays")){
			listePays.add((Pays) ec);
		}
		
		return listePays;
	}

	public void setListePays(List listePays) {
		this.listePays = listePays;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

}
