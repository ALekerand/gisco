package com.artm.etats;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.lowagie.text.Cell;

/**
 * 
 * @author J3A-POSTE1-A.Lekerand
 * Bean permettant d'editer un recu d'inscription
 *
 */

@Component
@Scope("request")
public class EtatInscriptionCand implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private File repectoire;
		private  String nomFichier;
		
		  private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 28,
		      Font.BOLD);
		  private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
		      Font.NORMAL, BaseColor.GREEN);
		  private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
		      Font.BOLD);
		  
		  private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
			      Font.BOLD);
		  
		  private static Font normalText = new Font(Font.FontFamily.TIMES_ROMAN, 8,
		      Font.BOLD);
		  private static Font normalTitle = new Font(Font.FontFamily.TIMES_ROMAN, 9,
			      Font.BOLD);
		  
		  private static Font smallText = new Font(Font.FontFamily.COURIER,8,
				  Font.NORMAL);
		  
		  private static Font smallTextGras = new Font(Font.FontFamily.COURIER,8,
				  Font.BOLD);
		  
		  
		  public static final String RESOURCE = "http://localhost:8080/Sherpa/resources/images/logo_j3a.jpg";
		  
		  public void creerRecu() throws IOException{
			  //Créer le dosier de stockage des fichier générés
			  repectoire = new File("c:/Recus");
			  repectoire.mkdirs();
	
		  try {
			Document document = new Document(PageSize.A4);
			document.setMargins(20, 20, 20, 20);
			nomFichier = "recu.pdf";
			PdfWriter.getInstance(document, new FileOutputStream(repectoire+"/"+nomFichier));

			  document.open();
			  addContent(document);			  
			  document.close();
			  ouvrirFicher();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Erreur1");
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur2");

		}
		  }
		  

			  private void createEteteDoc(Document document) throws DocumentException {
				  String titredocement = "RECEPISSE D'IDENTIFICATION CANDIDAT";
				  PdfPTable tabEntete = new PdfPTable(1);
				  tabEntete.setWidthPercentage(100);
				
				  PdfPCell cell = new PdfPCell(new Phrase(titredocement, normalTitle)); 
				  cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				  cell.setBorder(Rectangle.NO_BORDER);
				  tabEntete.addCell(cell);
				  document.add(tabEntete);
				  
				  
			  }
			  
			  
			  public void infoCandidat(Document document) throws DocumentException{
				  PdfPTable tableauCandidat = new PdfPTable(2);
				  tableauCandidat.getDefaultCell().setBorder(Cell.NO_BORDER);
				  PdfPCell cell = new PdfPCell();
				  
				  tableauCandidat.addCell(new Phrase("Session: "));
				  cell =  new PdfPCell(new Phrase("la session ici",smallTextGras));
				  cell.setBorder(Rectangle.NO_BORDER);
				  tableauCandidat.addCell(cell);
				  
				  tableauCandidat.addCell(new Phrase("Ecole: "));
				  cell = new PdfPCell(new Phrase("Ecole ici",smallTextGras));
				  cell.setBorder(Rectangle.NO_BORDER);
				  tableauCandidat.addCell(cell);
				  
				  tableauCandidat.addCell(new Phrase("N°Dossier: "));
				  cell =  new PdfPCell(new Phrase("N°Dossier ici",smallTextGras));
				  cell.setBorder(Rectangle.NO_BORDER);
				  tableauCandidat.addCell(cell);
				  
				  tableauCandidat.addCell(new Phrase("Nom : "));
				  cell = new PdfPCell(new Phrase("Nom candidat ici",smallTextGras));
				  cell.setBorder(Rectangle.NO_BORDER);
				  tableauCandidat.addCell(cell);
				  
				  tableauCandidat.addCell(new Phrase("Prénoms: "));
				  cell = new PdfPCell(new Phrase("Prénoms candidat ici",smallTextGras));
				  cell.setBorder(Rectangle.NO_BORDER);
				  tableauCandidat.addCell(cell);
				  
				  tableauCandidat.addCell(new Phrase("Date Naissance: "));
				  cell = new PdfPCell(new Phrase("date de naissance du candidat + ieu de naissance",smallTextGras));
				  cell.setBorder(Rectangle.NO_BORDER);
				  tableauCandidat.addCell(cell);
				  
				  tableauCandidat.addCell(new Phrase("Sexe : "));
				  cell = new PdfPCell(new Phrase("Sexe du candidat",smallTextGras));
				  cell.setBorder(Rectangle.NO_BORDER);
				  tableauCandidat.addCell(cell);
				  
				  tableauCandidat.addCell(new Phrase("Nationalité: "));
				  cell = new PdfPCell(new Phrase("Ivoirienne",smallTextGras));
				  cell.setBorder(Rectangle.NO_BORDER);
				  tableauCandidat.addCell(cell);
				  
				  document.add(tableauCandidat);

				  
			  }

			  
			  private void addContent(Document document) throws DocumentException, MalformedURLException, IOException {
				  createEteteDoc(document);
				  infoCandidat(document);
			  }

			  
			  
			 

			  public void addEmptyLine(Paragraph paragraph, int number) {
			    for (int i = 0; i < number; i++) {
			      paragraph.add(new Paragraph(" "));
			    }
			  }
			    
			  
			  //Ouverture du fichier pdf de la quittance
			  public void ouvrirFicher(){
				  System.out.println("début ouverture du fichier pdf");//clean After
				  try {
					  
						if ((new File("C:\\Recus\\"+nomFichier+"")).exists()) {
				 
							Process p = Runtime
							   .getRuntime()
							   .exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Recus\\"+nomFichier+"");
							p.waitFor();
				 
						} else {
				 
							System.out.println("File is not exists");
				 
						}
				 
						System.out.println("Done");
				 
				  	  } catch (Exception ex) {
						ex.printStackTrace();
					  }
				 
				
				  System.out.println("Fin ouverture du fichier pdf");//Clean after
					
			  }
			  		  
}
