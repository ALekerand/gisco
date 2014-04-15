package dataModel;

import java.util.List;

import hibernate.beans.Pays;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

public class PaysModel extends ListDataModel<Pays> implements
		SelectableDataModel<Pays> {
	
	//CONSTRUCTEUR
	public PaysModel(){
		
	}
	
	public PaysModel(List<Pays> data){
		super(data);
		
	}

	@Override
	public Pays getRowData(String rowkey) {
		// TODO Auto-generated method stub
		List<Pays> listePays=(List<Pays>) getWrappedData();
		for(Pays tata : listePays){
			//if(tata.getId().equals(rowkey))
			if(tata.getId().toString().equals(rowkey))
				return tata;
		}
		return null;
	}

	@Override
	public Object getRowKey(Pays tata) {
		// TODO Auto-generated method stub
		return tata.getId();
	}

}
