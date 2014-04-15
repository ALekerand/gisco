/**
 * 
 */
package dataModel;

import hibernate.beans.Sexes;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

/**
 * @author ngo
 *
 */
public class SexeModel extends ListDataModel<Sexes> implements
		SelectableDataModel<Sexes> {

	@Override
	public Sexes getRowData(String rowKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getRowKey(Sexes arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
