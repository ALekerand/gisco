package com.artm.managedBeans;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.commons.fileupload.FileUpload;
import org.primefaces.event.FileUploadEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Anneeconcours;
import com.artm.hibernate.beans.Candidat;
import com.artm.hibernate.beans.Pays;
import com.artm.objetService.IService;
import com.artm.requetes.ReqAnneeConcours;

@Component
@Scope("session")
public class ManageJonctionPhoto implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	// Injection de spring
	@Autowired
	IService  service;
	@Autowired
	ReqAnneeConcours reqAnneeConcours;
	@Autowired
	FileUploadController fileUploadController;
	
	
	
	private String destination="E:\\tmp\\";
	private Anneeconcours monObjetAnneeconcours = new Anneeconcours();
	private List<Pays> listePays = new ArrayList<>();
	private Pays selectedPay = new Pays();
	private List listCandidat;
	private Candidat selectedCandidat = new Candidat();


	
	public List recuperPays(){
		listePays.clear();
		List<Anneeconcours> listeAnnecours = new ArrayList<>();
		listeAnnecours = getReqAnneeConcours().recupererAnneeConcours(monObjetAnneeconcours.getLibAnneeConcours());
		for (Anneeconcours anneeconcours : listeAnnecours ) {
				//Verifier que la liste est vide
			if(listePays.isEmpty()){
				//on ajoute
				listePays.add(anneeconcours.getCodepays());
				System.out.println("---->> Ajout d'un pays");
			}else{//Cas contraire
					//Verifier si lélément n'est pas déjà dans la liste de pays
				if(!(listePays.contains(anneeconcours.getCodepays()))){
					//si non on l'ajoute
				listePays.add(anneeconcours.getCodepays());
				System.out.println("---->> Ajout d'un pays");
			}
			}
		}
		return listePays;
		
	}
	
	
	public void upload(FileUploadEvent event) { 
		
		FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded."); 
		FacesContext.getCurrentInstance().addMessage(null, msg);
		// Do what you want with the file       
		try {
		copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
		
		//Mis à jour du Candidat
		System.out.println(selectedCandidat.getId());// Clean after
		selectedCandidat.setPhotoCandidat(destination+event.getFile().getFileName());
		getService().updateObject(selectedCandidat);
		} catch (IOException e) {
		e.printStackTrace();
		}
		} 
	
	
		public void copyFile(String fileName, InputStream in) {
		try {
		// write the inputStream to a FileOutputStream
		OutputStream out = new FileOutputStream(new File(destination + fileName));
		int read = 0;
		byte[] bytes = new byte[1024];
		while ((read = in.read(bytes)) != -1) {
		out.write(bytes, 0, read);
		}
		in.close();
		out.flush();
		out.close();
		System.out.println("New file created!");
		} catch (IOException e) {
		System.out.println(e.getMessage());

		}
		}
		
		
		

// ******************* Getters and Setters ******************

	public Anneeconcours getMonObjetAnneeconcours() {
		setMonObjetAnneeconcours(reqAnneeConcours.recupererDernierAnneeConcours().get(0));
		return monObjetAnneeconcours;
	}



	public void setMonObjetAnneeconcours(Anneeconcours monObjetAnneeconcours) {
		this.monObjetAnneeconcours = monObjetAnneeconcours;
	}



	public IService getService() {
		return service;
	}



	public void setService(IService service) {
		this.service = service;
	}



	public ReqAnneeConcours getReqAnneeConcours() {
		return reqAnneeConcours;
	}



	public void setReqAnneeConcours(ReqAnneeConcours reqAnneeConcours) {
		this.reqAnneeConcours = reqAnneeConcours;
	}




	public List<Pays> getListePays() {
		recuperPays();
		System.out.println("------taille de la liste"+listePays.size()); //clean afteer
		return listePays;
	}




	public void setListePays(List<Pays> listePays) {
		this.listePays = listePays;
	}


	public Pays getSelectedPay() {
		return selectedPay;
	}

	public void setSelectedPay(Pays selectedPay) {
		this.selectedPay = selectedPay;
	}


	public FileUploadController getFileUploadController() {
		return fileUploadController;
	}

	public void setFileUploadController(FileUploadController fileUploadController) {
		this.fileUploadController = fileUploadController;
	}


	public List getListCandidat() {
		listCandidat = getService().getObjects("Candidat");
		return listCandidat;
	}


	public void setListCandidat(List listCandidat) {
		this.listCandidat = listCandidat;
	}


	public Candidat getSelectedCandidat() {
		return selectedCandidat;
	}


	public void setSelectedCandidat(Candidat selectedCandidat) {
		this.selectedCandidat = selectedCandidat;
	}


}
