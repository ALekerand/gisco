package etats;

import hibernate.beans.Anneeconcours;
import hibernate.beans.Candidat;
import hibernate.beans.Concours;
import hibernate.beans.Ecole;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

import javax.faces.bean.ManagedBean;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


@ManagedBean
public class EtatAutorisationConcours {

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
	
	
	//Création de la méthode
	
public void creerAutorisation() throws FileNotFoundException, DocumentException{
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
public void addContent(Document document) throws DocumentException{
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
	Phrase civilite = new Phrase("Mr,Mlle"+candidat.getNomCandidat()+" "+candidat.getPrenomsCandidat()+" né(e) le");
	Phrase dateNais = new Phrase(dateFormat.format(candidat.getDateNaissance()));
	Phrase lieuNais = new Phrase("à "+candidat.getLieuNaissance()+" est autorisé à s'inscrire au ");
	Phrase concours = new Phrase(getConcours().getLibConcours());
	
	paragraph.add(civilite);
	paragraph.add(dateNais);
	paragraph.add(lieuNais);
	paragraph.add(concours);
	
	document.add(tableauCandidat);
	document.add(paragraph);
		
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
