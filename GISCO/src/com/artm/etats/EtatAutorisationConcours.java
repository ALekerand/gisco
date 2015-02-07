package com.artm.etats;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Anneeconcours;
import com.artm.hibernate.beans.Candidat;
import com.artm.hibernate.beans.Concours;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


@Component
@Scope("request")
public class EtatAutorisationConcours implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public EtatAutorisationConcours() {
		// TODO Auto-generated constructor stub
	}
	
	private static Font titregras =new Font(Font.FontFamily.COURIER, 16, Font.BOLD);
	
		// Déclaration de paramètres
	private File repertoire =new File("c:/Etats");
	private String nomfichier;
	
	private Anneeconcours anneeconcours = new Anneeconcours();
	private Candidat candidat = new Candidat();
	private Concours concours = new Concours();
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	public static final String RESOURCE = "http://localhost:8080/GISCO/ressources/mesImages/logo_artm.jpg";
	private List listConcours = new ArrayList<>();
	
	
	//Création de la méthode
	
public void creerAutorisation() throws DocumentException, MalformedURLException, IOException{
	Document document = new Document(PageSize.A4);
	document.setMargins(15, 15, 15, 15);
	nomfichier =getCandidat().getId()+getConcours().getAbrevEcoleConcours();
	repertoire.mkdirs();
	PdfWriter.getInstance(document, new FileOutputStream(repertoire+"/"+nomfichier));
	
	//ouverture du document en écriture
	System.out.println("------->>Ouverture");
	document.open();
	addContent(document);
	document.close();
	System.out.println("------->>Fermerture");

}

//création du contenu du document
public void addContent(Document document) throws DocumentException, MalformedURLException, IOException{
	//logo ARTM
	Image logo = Image.getInstance(new URL(RESOURCE));
	//logo.scalePercent(80f);
	document.add(logo);
	
	//création d'un paragraphe
	Paragraph titredocument = new Paragraph("AUTORISATION D'INSCRIPTION CONCOURS",titregras);
	titredocument.setSpacingAfter(30);
	document.add(titredocument);
	
	//cration d'un tableau de 2 colonnes
	PdfPTable tableauCandidat = new PdfPTable(2);
	tableauCandidat.addCell(new Phrase("Session"));
	
	tableauCandidat.addCell(""+getAnneeconcours().getAnneeConcoursDebut());
	
	tableauCandidat.addCell(new Phrase("Ecole"));
	
	tableauCandidat.addCell(getConcours().getAbrevEcoleConcours());
	
//	tableauCandidat.addCell(new Phrase("Mr,Mlle"));

	// Paragraph information Candidat
	Paragraph paragraph = new Paragraph();
	Phrase civilite = new Phrase("Mr,Mlle "+candidat.getNomCandidat()+" "+candidat.getPrenomsCandidat()+" né(e) le ");
	Phrase dateNais = new Phrase(dateFormat.format(candidat.getDateNaissance()));
	Phrase lieuNais = new Phrase(" à "+candidat.getLieuNaissance()+" ayant remplir les conditions administratives est autorisé à s'inscrire au ");
	Phrase concoursEcole = new Phrase("concours d'entrée à l'Accadémie des Sciences et Techniques de la Mer (ARSTM)");
	Phrase concours = new Phrase(getConcours().getLibConcours());

	paragraph.add(civilite);
	paragraph.add(dateNais);
	paragraph.add(lieuNais);
	paragraph.add(concoursEcole);
	paragraph.add(concours);
	
	document.add(tableauCandidat);
	document.add(paragraph);
	
	//Pour le tableau des concours
	recupererConcours(document);
		
}



//Methode pour la liste des concours
public void recupererConcours( Document document) throws DocumentException{
	//cration d'un tableau de 2 colonnes
	PdfPCell cell;
		PdfPTable tableauconcours = new PdfPTable(2);
		tableauconcours.addCell(new Phrase("Ecole"));
		tableauconcours.addCell(new Phrase("Filière"));
		
		for(int i =0 ; i<listConcours.size(); i++){
			Concours concours = new Concours();
			concours = (Concours) listConcours.get(i);
		 cell = new PdfPCell(new Phrase(concours.getLibEcoleConcours()));
		 tableauconcours.addCell(cell);
		}
		
		document.add(tableauconcours);
		
}

public Anneeconcours getAnneeconcours() {
	return anneeconcours;
}

public void setAnneeconcours(Anneeconcours anneeconcours) {
	this.anneeconcours = anneeconcours;
}


public Candidat getCandidat() {
	return candidat;
}

public void setCandidat(Candidat candidat) {
	this.candidat = candidat;
}

public Concours getConcours() {
	return concours;
}

public void setConcours(Concours concours) {
	this.concours = concours;
}
}
