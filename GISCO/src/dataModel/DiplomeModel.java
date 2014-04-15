package dataModel;

import java.util.List;

import hibernate.beans.Diplomes;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

public class DiplomeModel extends ListDataModel<Diplomes> implements
		SelectableDataModel<Diplomes> {
	
	//CONSTRUCTEUR
	public DiplomeModel(){
		
	}
	
	public DiplomeModel(List<Diplomes> data){
		super(data);
		
	}

	@Override
	public Diplomes getRowData(String rowkey) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Diplomes> listeDiplome=(List<Diplomes>) getWrappedData();
		for(Diplomes tata : listeDiplome){
			//if(tata.getId().equals(rowkey))
			if(tata.getId().toString().equals(rowkey))
				return tata;
		}
		return null;
	}

	@Override
	public Object getRowKey(Diplomes tata) {
		// TODO Auto-generated method stub
		return tata.getId();
	}

}
