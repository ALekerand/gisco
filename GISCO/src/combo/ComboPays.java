package combo;

import hibernate.beans.Pays;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import dao.Crud;

public class ComboPays implements Converter {
	private Crud monCrud = new Crud();
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
	

	public Crud getMonCrud() {
		return monCrud;
	}

	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}

	public List getListePays() {
		listePays = new ArrayList<Pays>();
		for(Object ec:getMonCrud().getObjects("Pays")){
			listePays.add((Pays) ec);
		}
		
		return listePays;
	}

	public void setListePays(List listePays) {
		this.listePays = listePays;
	}

}
