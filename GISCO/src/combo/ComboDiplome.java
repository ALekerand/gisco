package combo;

import hibernate.beans.Diplomes;
import hibernate.beans.Niveaux;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import dao.Crud;

public class ComboDiplome implements Converter {
	
	private List <Diplomes> listeDiplome;
	private Crud monCrud = new Crud();
	
	

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

	

	public Crud getMonCrud() {
		return monCrud;
	}

	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}

	public List <Diplomes> getListeDiplome() {
		listeDiplome = new ArrayList<>();
		for(Object dp :getMonCrud().getObjects("Diplomes")){
			listeDiplome.add((Diplomes) dp);
		}
		return listeDiplome;
	}

	public void setListeDiplome(List <Diplomes> listeDiplome) {
		this.listeDiplome = listeDiplome;
	}
	
	/*private Crud monCrud = new Crud();
	private List<Diplomes> listeDiplome;

	public ComboDiplome() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String comboValue) {
		// TODO Auto-generated method stub
		if(comboValue.trim().equals("")){
			return null;
		}else{
			for(Diplomes ec:listeDiplome){
				if(ec.getLibDiplome().equals(comboValue))
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

	public Crud getMonCrud() {
		return monCrud;
	}

	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}

	public List<Diplomes> getListeDiplome() {
		listeDiplome= new ArrayList<Diplomes>();
		for(Object ec:getMonCrud().getObjects("Diplomes")){
			listeDiplome.add((Diplomes) ec);
		}
		return listeDiplome;
	}

	public void setListeDiplome(List<Diplomes> listeDiplome) {
		this.listeDiplome = listeDiplome;
	}*/

}
