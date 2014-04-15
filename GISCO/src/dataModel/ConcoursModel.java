package dataModel;

import java.util.List;

import hibernate.beans.Concours;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

public class ConcoursModel extends ListDataModel<Concours> implements
		SelectableDataModel<Concours> {
	
public ConcoursModel(){
		
	}
	
	public ConcoursModel(List<Concours> data){
		super(data);
		
	}

	@Override
	public Concours getRowData(String rowkey) {
		// TODO Auto-generated method stub
		List<Concours> listeConcours=(List<Concours>) getWrappedData();
		for(Concours tata : listeConcours){
			//if(tata.getId().equals(rowkey))
			if(tata.getId().toString().equals(rowkey))
				return tata;
		}
		return null;
	}

	@Override
	public Object getRowKey(Concours arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
