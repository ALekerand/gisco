/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  26/05/2014 18:24:53                      */
/*==============================================================*/


drop table if exists ABSENCE;

drop table if exists ACTIVITES;

drop table if exists ADRESSES;

drop table if exists ANNEECONCOURS;

drop table if exists ANNEES;

drop table if exists AVOIR;

drop table if exists CAISCONCOURS;

drop table if exists CAMPUS;

drop table if exists CANDIDAT;

drop table if exists CANDIDATURE;

drop table if exists CANDIDAT_SALLE;

drop table if exists CONCOURS;

drop table if exists CORRESPONDRE;

drop table if exists DETAILCAMPUS;

drop table if exists DIPLOMES;

drop table if exists ECHEANCE;

drop table if exists ECOLAGES;

drop table if exists ECOLE;

drop table if exists ETUDIANTS;

drop table if exists ETUDIANT_CANDIDATURE;

drop table if exists FILIERES;

drop table if exists INSCRIPTIONCONCOURS;

drop table if exists INSCRIPTIONS;

drop table if exists LOGEMENT;

drop table if exists LOGER;

drop table if exists MATIERE;

drop table if exists MATIERECONCOURS;

drop table if exists MATIERE_EXAM;

drop table if exists MATRIMONIALES;

drop table if exists MERES;

drop table if exists MODE;

drop table if exists MOTIF;

drop table if exists NATIONALITES;

drop table if exists NATURE;

drop table if exists NIVEAUX;

drop table if exists NOTECONCOURS;

drop table if exists NOTES;

drop table if exists NOTEXAM;

drop table if exists ORIGINE;

drop table if exists PARAMMATIERE;

drop table if exists PARAMMATIEREXAM;

drop table if exists PAYS;

drop table if exists PERES;

drop table if exists PROFESSIONS;

drop table if exists REGIME;

drop table if exists SALLES;

drop table if exists SANTES;

drop table if exists SCOLARITES;

drop table if exists SECTION;

drop table if exists SEMESTRE;

drop table if exists SEXES;

drop table if exists TUTEURS;

drop table if exists TYPEMATIERECONCOURS;

drop table if exists TYPE_MATIERE;

drop table if exists TYPE_MATIERE_EXAM;

drop table if exists UTILISATEURS;

drop table if exists VERSEMENT;

/*==============================================================*/
/* Table : ABSENCE                                              */
/*==============================================================*/
create table ABSENCE
(
   CODE_ABSENCE         int not null,
   CODE_MOTIF           int not null,
   NUMETUDIANT          int not null,
   CODE_SEMESTRE        int not null,
   CODE_ANNEES          int not null,
   CODE_NATURE          int not null,
   DATE_SAISIE          date,
   DATE_ABSENCE         date,
   HEURE_DEBUT          time,
   HEURE_FIN            time,
   primary key (CODE_ABSENCE)
);

/*==============================================================*/
/* Table : ACTIVITES                                            */
/*==============================================================*/
create table ACTIVITES
(
   CODE_ACTIVITE        int not null,
   LIB_ACTIVITE         char(20),
   primary key (CODE_ACTIVITE)
);

/*==============================================================*/
/* Table : ADRESSES                                             */
/*==============================================================*/
create table ADRESSES
(
   CODE_ADRESSE         int not null,
   BOITE_POSTALE        char(25),
   EMAIL                char(25),
   TEL1                 char(25),
   TEL2                 char(25),
   primary key (CODE_ADRESSE)
);

/*==============================================================*/
/* Table : ANNEECONCOURS                                        */
/*==============================================================*/
create table ANNEECONCOURS
(
   CODE_ANNEES_CONCOURS int not null,
   CODE_CONCOURS        int not null,
   CODEPAYS             int not null,
   ANNEE_CONCOURS_DEBUT int,
   ANNEE_CONCOURS_FIN   int,
   LIB_ANNEE_CONCOURS   char(15),
   DATE_COMPOSITION     date,
   DROIT_CONCOURS       float(8,2),
   NBREPLACES_CONCOURS  int,
   primary key (CODE_ANNEES_CONCOURS)
);

/*==============================================================*/
/* Table : ANNEES                                               */
/*==============================================================*/
create table ANNEES
(
   CODE_ANNEES          int not null,
   ANNEES_DEBUT         int,
   ANNEES_FIN           int,
   SESSION_EXAMEN       char(20),
   DATE_COMMISSION      date,
   LIB_ANNEE_SCOLAIRE   char(10),
   primary key (CODE_ANNEES)
);

/*==============================================================*/
/* Table : AVOIR                                                */
/*==============================================================*/
create table AVOIR
(
   NUMETUDIANT          int not null,
   CODESEXE             int not null,
   primary key (NUMETUDIANT, CODESEXE)
);

/*==============================================================*/
/* Table : CAISCONCOURS                                         */
/*==============================================================*/
create table CAISCONCOURS
(
   CODE_CAISCONCOURS    int not null,
   CODE_MODE            int not null,
   CODE_INSCRIPTION_CONCOURS int not null,
   DATE_CAISCONCOURS    date,
   LIB_CAISCONCOURS     char(25),
   MONTANT_CAISCONCOURS float(8,2),
   primary key (CODE_CAISCONCOURS)
);

/*==============================================================*/
/* Table : CAMPUS                                               */
/*==============================================================*/
create table CAMPUS
(
   CODE_CAMPUS          int not null,
   LIB_CAMPUS           char(20),
   primary key (CODE_CAMPUS)
);

/*==============================================================*/
/* Table : CANDIDAT                                             */
/*==============================================================*/
create table CANDIDAT
(
   NUM_CANDIDAT         int not null,
   CODENIVEAU           int not null,
   CODE_DIPLOME         int not null,
   CODENATIONALITE      int not null,
   CODEPAYS             int not null,
   CODESEXE             int not null,
   NOM_CANDIDAT         char(50),
   PRENOMS_CANDIDAT     char(80),
   DATE_NAISSANCE       date,
   LIEU_NAISSANCE       char(50),
   PHOTO_CANDIDAT       char(150),
   primary key (NUM_CANDIDAT)
);

/*==============================================================*/
/* Table : CANDIDATURE                                          */
/*==============================================================*/
create table CANDIDATURE
(
   CODE_CANDIDATURE     int not null,
   LIB_CANDIDATURE      char(25),
   primary key (CODE_CANDIDATURE)
);

/*==============================================================*/
/* Table : CANDIDAT_SALLE                                       */
/*==============================================================*/
create table CANDIDAT_SALLE
(
   NUM_CANDIDAT         int not null,
   CODE_SALLE           int not null,
   DATE_CANDIDAT_SALLE  date,
   primary key (NUM_CANDIDAT, CODE_SALLE)
);

/*==============================================================*/
/* Table : CONCOURS                                             */
/*==============================================================*/
create table CONCOURS
(
   CODE_CONCOURS        int not null,
   LIB_CONCOURS         char(60),
   LIB_ECOLE_CONCOURS   char(80),
   ABREV_ECOLE_CONCOURS char(20),
   ABREV_OBTENTION_DIPLOME char(25),
   OBTENTION_DIPLOME    char(100),
   primary key (CODE_CONCOURS)
);

/*==============================================================*/
/* Table : CORRESPONDRE                                         */
/*==============================================================*/
create table CORRESPONDRE
(
   CODE_MATIERE         int not null,
   CODE_SEMESTRE        int not null,
   ANNEE_MATIERE_SEMESTRE char(10),
   DATE_MATIERE         date,
   primary key (CODE_MATIERE, CODE_SEMESTRE)
);

/*==============================================================*/
/* Table : DETAILCAMPUS                                         */
/*==============================================================*/
create table DETAILCAMPUS
(
   CODE_DETAIL_CAMPUS   int not null,
   CODE_CAMPUS          int not null,
   LIB_DETAIL_CAMPUS    char(20),
   ABREV_CAMPUS         char(10),
   primary key (CODE_DETAIL_CAMPUS)
);

/*==============================================================*/
/* Table : DIPLOMES                                             */
/*==============================================================*/
create table DIPLOMES
(
   CODE_DIPLOME         int not null,
   LIB_DIPLOME          char(80),
   ABREV_DIPLOME        char(20),
   primary key (CODE_DIPLOME)
);

/*==============================================================*/
/* Table : ECHEANCE                                             */
/*==============================================================*/
create table ECHEANCE
(
   CODE_ECHEANCE        int not null,
   CODE_ECOLAGE         int not null,
   MONTANT_ECHANCE      float(8,2),
   DATE_ECHANCE         date,
   LIB_ECHEANCE         char(20),
   primary key (CODE_ECHEANCE)
);

/*==============================================================*/
/* Table : ECOLAGES                                             */
/*==============================================================*/
create table ECOLAGES
(
   CODE_ECOLAGE         int not null,
   CODE_SECTION         int not null,
   MONTANT_ECOLAGE      float(8,2),
   primary key (CODE_ECOLAGE)
);

/*==============================================================*/
/* Table : ECOLE                                                */
/*==============================================================*/
create table ECOLE
(
   CODE_ECOLE           int not null,
   NOM_ECOLE            char(45),
   ABREV_ECOLE          char(12),
   primary key (CODE_ECOLE)
);

/*==============================================================*/
/* Table : ETUDIANTS                                            */
/*==============================================================*/
create table ETUDIANTS
(
   NUMETUDIANT          int not null,
   CODE_ADRESSE         int,
   NUM_MERE             int,
   CODESANTE            int not null,
   CODENATIONALITE      int not null,
   CODE_DIPLOME         int,
   NUMMERE2             int,
   CODEMATRIMONIALE     int not null,
   CODEPAYS             int not null,
   NUM_PERE             int,
   CODENIVEAU           int not null,
   MLE                  char(20),
   NOM                  char(50),
   PRENOMS              char(50),
   DATENAIS             date,
   LIEUNAIS             char(50),
   NBENFANTS            int,
   NBSOEURS             int,
   NBFRERES             int,
   NUMCNI               char(30),
   PHOTO                longblob,
   primary key (NUMETUDIANT)
);

/*==============================================================*/
/* Table : ETUDIANT_CANDIDATURE                                 */
/*==============================================================*/
create table ETUDIANT_CANDIDATURE
(
   NUMETUDIANT          int not null,
   CODE_CANDIDATURE     int not null,
   ANNEE_CANDIDATURE    char(20),
   primary key (NUMETUDIANT, CODE_CANDIDATURE)
);

/*==============================================================*/
/* Table : FILIERES                                             */
/*==============================================================*/
create table FILIERES
(
   CODE_FILIERE         int not null,
   CODE_ECOLE           int not null,
   NOM_FILIERE          char(50),
   ABREV_FILIERE        char(10),
   primary key (CODE_FILIERE)
);

/*==============================================================*/
/* Table : INSCRIPTIONCONCOURS                                  */
/*==============================================================*/
create table INSCRIPTIONCONCOURS
(
   CODE_INSCRIPTION_CONCOURS int not null,
   NUM_CANDIDAT         int not null,
   CODE_ANNEES_CONCOURS int not null,
   CODE_CONCOURS        int not null,
   DATE_INSCRIPTION_CONCOURS date,
   SOLDE                bool,
   primary key (CODE_INSCRIPTION_CONCOURS)
);

/*==============================================================*/
/* Table : INSCRIPTIONS                                         */
/*==============================================================*/
create table INSCRIPTIONS
(
   CODE_INSCRIPTION     int not null,
   CODE_ANNEES          int not null,
   NUMETUDIANT          int not null,
   CODE_SECTION         int not null,
   CODE_REGIME          int not null,
   DATE_INSCRIPTION     time,
   primary key (CODE_INSCRIPTION)
);

/*==============================================================*/
/* Table : LOGEMENT                                             */
/*==============================================================*/
create table LOGEMENT
(
   CODE_LOGE            int not null,
   LIB_CAMPUS_LOGE      char(10),
   LIB_DETAIL_CAMPUS_LOGE char(20),
   ABREV_AMPUS_LOGE     char(10),
   primary key (CODE_LOGE)
);

/*==============================================================*/
/* Table : LOGER                                                */
/*==============================================================*/
create table LOGER
(
   NUMETUDIANT          int not null,
   CODE_LOGE            int not null,
   ANNEE_LOGEMENT       char(20),
   primary key (NUMETUDIANT, CODE_LOGE)
);

/*==============================================================*/
/* Table : MATIERE                                              */
/*==============================================================*/
create table MATIERE
(
   CODE_MATIERE         int not null,
   CODE_SECTION         int not null,
   LIB_MATIERE          char(60),
   ABREV_MATIERE        char(20),
   COEF_MATIERE         int,
   primary key (CODE_MATIERE)
);

/*==============================================================*/
/* Table : MATIERECONCOURS                                      */
/*==============================================================*/
create table MATIERECONCOURS
(
   CODE_MATIERE_CONCOURS int not null,
   CODE_CONCOURS        int not null,
   CODE_TYPE_MATIERE    int not null,
   LIB_MATIERE_CONCOURS char(60),
   ABREV_MATIERE_CONCOURS char(25),
   COEF_MATIERE_CONCOURS int,
   primary key (CODE_MATIERE_CONCOURS)
);

/*==============================================================*/
/* Table : MATIERE_EXAM                                         */
/*==============================================================*/
create table MATIERE_EXAM
(
   CODE_MATIERE_EXAM    int not null,
   CODE_SECTION         int not null,
   LIB_MATIERE_EXAM     char(80),
   ABREV_MATIERE_EXAM   char(25),
   COEF_MATIERE_EXAM    int,
   primary key (CODE_MATIERE_EXAM)
);

/*==============================================================*/
/* Table : MATRIMONIALES                                        */
/*==============================================================*/
create table MATRIMONIALES
(
   CODEMATRIMONIALE     int not null,
   LIBMATRIMONIALE      char(10),
   primary key (CODEMATRIMONIALE)
);

/*==============================================================*/
/* Table : MERES                                                */
/*==============================================================*/
create table MERES
(
   NUM_MERE             int not null,
   CODE_PROFESSION      int,
   CODE_ADRESSE         int,
   NOM_PRENOMS_MERE     char(50),
   primary key (NUM_MERE)
);

/*==============================================================*/
/* Table : MODE                                                 */
/*==============================================================*/
create table MODE
(
   CODE_MODE            int not null,
   LIB_MODE             char(20),
   primary key (CODE_MODE)
);

/*==============================================================*/
/* Table : MOTIF                                                */
/*==============================================================*/
create table MOTIF
(
   CODE_MOTIF           int not null,
   LIB_MOTIF            char(30),
   primary key (CODE_MOTIF)
);

/*==============================================================*/
/* Table : NATIONALITES                                         */
/*==============================================================*/
create table NATIONALITES
(
   CODENATIONALITE      int not null,
   LIBNATIONALITE       char(30),
   primary key (CODENATIONALITE)
);

/*==============================================================*/
/* Table : NATURE                                               */
/*==============================================================*/
create table NATURE
(
   CODE_NATURE          int not null,
   LIB_NATURE           char(25),
   primary key (CODE_NATURE)
);

/*==============================================================*/
/* Table : NIVEAUX                                              */
/*==============================================================*/
create table NIVEAUX
(
   CODENIVEAU           int not null,
   LIB_NIVEAU           char(25),
   ABREV_NIVEAU         char(20),
   primary key (CODENIVEAU)
);

/*==============================================================*/
/* Table : NOTECONCOURS                                         */
/*==============================================================*/
create table NOTECONCOURS
(
   CODE_NOTE_CONCOURS   int not null,
   NUM_CANDIDAT         int not null,
   CODE_MATIERE_CONCOURS int not null,
   NOTE_CONCOURS        decimal,
   DATE_NOTE_CONCOURS   date,
   primary key (CODE_NOTE_CONCOURS)
);

/*==============================================================*/
/* Table : NOTES                                                */
/*==============================================================*/
create table NOTES
(
   CODE_NOTE            int not null,
   CODE_MATIERE         int not null,
   CODE_SEMESTRE        int not null,
   NUMETUDIANT          int not null,
   CODE_ANNEES          int not null,
   MOYENNE              decimal,
   DATE_NOTE            date,
   primary key (CODE_NOTE)
);

/*==============================================================*/
/* Table : NOTEXAM                                              */
/*==============================================================*/
create table NOTEXAM
(
   CODE_NOTEXAM         int not null,
   NUMETUDIANT          int not null,
   CODE_MATIERE_EXAM    int not null,
   NOTE_EXAM            decimal,
   ANNEE_EXAM           char(20),
   DATE_NOTE_EXAM       date,
   primary key (CODE_NOTEXAM)
);

/*==============================================================*/
/* Table : ORIGINE                                              */
/*==============================================================*/
create table ORIGINE
(
   CODE_ORIGINR         int not null,
   LIB_ORIGINE          char(15),
   primary key (CODE_ORIGINR)
);

/*==============================================================*/
/* Table : PARAMMATIERE                                         */
/*==============================================================*/
create table PARAMMATIERE
(
   CODE_PARAMMATIERE    int not null,
   CODE_SECTION         int not null,
   CODE_TYPE            int not null,
   LIB_PARAMMATIRE      char(60),
   ABREV_PARAMMATIERE   char(20),
   COEF_PARAMMATIERE    int,
   primary key (CODE_PARAMMATIERE)
);

/*==============================================================*/
/* Table : PARAMMATIEREXAM                                      */
/*==============================================================*/
create table PARAMMATIEREXAM
(
   CODE_PARAMMATIERE_EXAM int not null,
   CODE_TYPE_EXAM       int not null,
   CODE_SECTION         int not null,
   LIB_PARAMMATIERE_EXAM char(80),
   ABREV_PARAMMATIERE_EXAM char(25),
   COEF_PARAMMATIERE_EXAM int,
   primary key (CODE_PARAMMATIERE_EXAM)
);

/*==============================================================*/
/* Table : PAYS                                                 */
/*==============================================================*/
create table PAYS
(
   CODEPAYS             int not null,
   LIBPAYS              char(50),
   REPUBLIC             char(80),
   ABREVPAYS            char(25),
   primary key (CODEPAYS)
);

/*==============================================================*/
/* Table : PERES                                                */
/*==============================================================*/
create table PERES
(
   NUM_PERE             int not null,
   CODE_ADRESSE         int,
   CODE_PROFESSION      int,
   NOM_PRENOMS_PERE     char(50),
   primary key (NUM_PERE)
);

/*==============================================================*/
/* Table : PROFESSIONS                                          */
/*==============================================================*/
create table PROFESSIONS
(
   CODE_PROFESSION      int not null,
   LIB_PROFESSION       char(50),
   primary key (CODE_PROFESSION)
);

/*==============================================================*/
/* Table : REGIME                                               */
/*==============================================================*/
create table REGIME
(
   CODE_REGIME          int not null,
   LIB_REGIME           char(30),
   primary key (CODE_REGIME)
);

/*==============================================================*/
/* Table : SALLES                                               */
/*==============================================================*/
create table SALLES
(
   CODE_SALLE           int not null,
   NUM_SALLE            char(5),
   LIB_SALLE            char(25),
   NBRE_PLACE           int,
   primary key (CODE_SALLE)
);

/*==============================================================*/
/* Table : SANTES                                               */
/*==============================================================*/
create table SANTES
(
   CODESANTE            int not null,
   LIBSANTE             char(15),
   primary key (CODESANTE)
);

/*==============================================================*/
/* Table : SCOLARITES                                           */
/*==============================================================*/
create table SCOLARITES
(
   CODE_SCOLARITE       int not null,
   NUMETUDIANT          int not null,
   CODE_ANNEES          int not null,
   FRAIS_INSCRIPTION    float(8,2),
   FRAIS_ASSURANCE      float(8,2),
   FRAIS_TENUE_COMPLET  float(8,2),
   FRAIS_CAMPUS         float(8,2),
   FRAIS_TENUE_SPORT    float(8,2),
   MT_ECOLAGE           float(8,2),
   FRAIS_ANNEXE         float(8,2),
   FRAIS_RESTAURATION   float(8,2),
   FRAIS_EXAMEN         float(8,2),
   primary key (CODE_SCOLARITE)
);

/*==============================================================*/
/* Table : SECTION                                              */
/*==============================================================*/
create table SECTION
(
   CODE_SECTION         int not null,
   CODE_FILIERE         int not null,
   NOM_SECTION          char(50),
   ABREV_SECTION        char(10),
   SECTION_EXAM         bool,
   primary key (CODE_SECTION)
);

/*==============================================================*/
/* Table : SEMESTRE                                             */
/*==============================================================*/
create table SEMESTRE
(
   CODE_SEMESTRE        int not null,
   LIB_SEMESTRE         char(15),
   primary key (CODE_SEMESTRE)
);

/*==============================================================*/
/* Table : SEXES                                                */
/*==============================================================*/
create table SEXES
(
   CODESEXE             int not null,
   LIBSEXE              char(10),
   primary key (CODESEXE)
);

/*==============================================================*/
/* Table : TUTEURS                                              */
/*==============================================================*/
create table TUTEURS
(
   NUMMERE2             int not null,
   CODE_ADRESSE         int,
   NOM_PRENOMS_TUTEUR   char(50),
   primary key (NUMMERE2)
);

/*==============================================================*/
/* Table : TYPEMATIERECONCOURS                                  */
/*==============================================================*/
create table TYPEMATIERECONCOURS
(
   CODE_TYPE_MATIERE    int not null,
   TYPE_MATIERE_CONCOURS char(25),
   primary key (CODE_TYPE_MATIERE)
);

/*==============================================================*/
/* Table : TYPE_MATIERE                                         */
/*==============================================================*/
create table TYPE_MATIERE
(
   CODE_TYPE            int not null,
   LIB_TYPE             char(50),
   primary key (CODE_TYPE)
);

/*==============================================================*/
/* Table : TYPE_MATIERE_EXAM                                    */
/*==============================================================*/
create table TYPE_MATIERE_EXAM
(
   CODE_TYPE_EXAM       int not null,
   LIB_TYPE_EXAM        char(25),
   primary key (CODE_TYPE_EXAM)
);

/*==============================================================*/
/* Table : UTILISATEURS                                         */
/*==============================================================*/
create table UTILISATEURS
(
   CODE_UTILISATEUR     int not null,
   NOM_UTILISATEUR      char(30),
   MOT_DE_PASSE         char(25),
   primary key (CODE_UTILISATEUR)
);

/*==============================================================*/
/* Table : VERSEMENT                                            */
/*==============================================================*/
create table VERSEMENT
(
   CODE_VERSEMENT       int not null,
   CODE_MODE            int not null,
   CODE_ORIGINR         int not null,
   CODE_ANNEES          int not null,
   NUMETUDIANT          int,
   CODE_ACTIVITE        int not null,
   DATE_CAISSE          date,
   LIB_CAISSE           char(50),
   MONTANT_CAISSE       float(8,2),
   primary key (CODE_VERSEMENT)
);

alter table ABSENCE add constraint FK_ABSENCE_ANNEES foreign key (CODE_ANNEES)
      references ANNEES (CODE_ANNEES) on delete restrict on update restrict;

alter table ABSENCE add constraint FK_ABSENCE_ETUDIANT foreign key (NUMETUDIANT)
      references ETUDIANTS (NUMETUDIANT) on delete restrict on update restrict;

alter table ABSENCE add constraint FK_ABSENCE_SEMESTRE foreign key (CODE_SEMESTRE)
      references SEMESTRE (CODE_SEMESTRE) on delete restrict on update restrict;

alter table ABSENCE add constraint FK_AVOIR_MOTIF foreign key (CODE_MOTIF)
      references MOTIF (CODE_MOTIF) on delete restrict on update restrict;

alter table ABSENCE add constraint FK_AVOIR_NATURE foreign key (CODE_NATURE)
      references NATURE (CODE_NATURE) on delete restrict on update restrict;

alter table ANNEECONCOURS add constraint FK_ANNEECONCOURS_CONCOURS foreign key (CODE_CONCOURS)
      references CONCOURS (CODE_CONCOURS) on delete restrict on update restrict;

alter table ANNEECONCOURS add constraint FK_ORGANISER foreign key (CODEPAYS)
      references PAYS (CODEPAYS) on delete restrict on update restrict;

alter table AVOIR add constraint FK_AVOIR foreign key (NUMETUDIANT)
      references ETUDIANTS (NUMETUDIANT) on delete restrict on update restrict;

alter table AVOIR add constraint FK_AVOIR2 foreign key (CODESEXE)
      references SEXES (CODESEXE) on delete restrict on update restrict;

alter table CAISCONCOURS add constraint FK_MODE_CAISCONCOURS foreign key (CODE_MODE)
      references MODE (CODE_MODE) on delete restrict on update restrict;

alter table CAISCONCOURS add constraint FK_REGLER_INSCRIPTION foreign key (CODE_INSCRIPTION_CONCOURS)
      references INSCRIPTIONCONCOURS (CODE_INSCRIPTION_CONCOURS) on delete restrict on update restrict;

alter table CANDIDAT add constraint FK_DIPLOMES_CANDIDAT foreign key (CODE_DIPLOME)
      references DIPLOMES (CODE_DIPLOME) on delete restrict on update restrict;

alter table CANDIDAT add constraint FK_NATIONALITE_CANDIDAT foreign key (CODENATIONALITE)
      references NATIONALITES (CODENATIONALITE) on delete restrict on update restrict;

alter table CANDIDAT add constraint FK_NIVEAUX_CANDIDAT foreign key (CODENIVEAU)
      references NIVEAUX (CODENIVEAU) on delete restrict on update restrict;

alter table CANDIDAT add constraint FK_PAYS_CANDIDAT foreign key (CODEPAYS)
      references PAYS (CODEPAYS) on delete restrict on update restrict;

alter table CANDIDAT add constraint FK_SEXE_CANDIDAT foreign key (CODESEXE)
      references SEXES (CODESEXE) on delete restrict on update restrict;

alter table CANDIDAT_SALLE add constraint FK_CANDIDAT_SALLE foreign key (NUM_CANDIDAT)
      references CANDIDAT (NUM_CANDIDAT) on delete restrict on update restrict;

alter table CANDIDAT_SALLE add constraint FK_CANDIDAT_SALLE2 foreign key (CODE_SALLE)
      references SALLES (CODE_SALLE) on delete restrict on update restrict;

alter table CORRESPONDRE add constraint FK_CORRESPONDRE foreign key (CODE_MATIERE)
      references MATIERE (CODE_MATIERE) on delete restrict on update restrict;

alter table CORRESPONDRE add constraint FK_CORRESPONDRE2 foreign key (CODE_SEMESTRE)
      references SEMESTRE (CODE_SEMESTRE) on delete restrict on update restrict;

alter table DETAILCAMPUS add constraint FK_FAIRE_PARTIR foreign key (CODE_CAMPUS)
      references CAMPUS (CODE_CAMPUS) on delete restrict on update restrict;

alter table ECHEANCE add constraint FK_AVOIR_ECHEANCE foreign key (CODE_ECOLAGE)
      references ECOLAGES (CODE_ECOLAGE) on delete restrict on update restrict;

alter table ECOLAGES add constraint FK_ASSOCIER foreign key (CODE_SECTION)
      references SECTION (CODE_SECTION) on delete restrict on update restrict;

alter table ETUDIANTS add constraint FK_AVOIR_ADRESSE4 foreign key (CODE_ADRESSE)
      references ADRESSES (CODE_ADRESSE) on delete restrict on update restrict;

alter table ETUDIANTS add constraint FK_AVOIR_DIPLOME foreign key (CODE_DIPLOME)
      references DIPLOMES (CODE_DIPLOME) on delete restrict on update restrict;

alter table ETUDIANTS add constraint FK_DETENIR foreign key (CODENIVEAU)
      references NIVEAUX (CODENIVEAU) on delete restrict on update restrict;

alter table ETUDIANTS add constraint FK_ETRE foreign key (CODESANTE)
      references SANTES (CODESANTE) on delete restrict on update restrict;

alter table ETUDIANTS add constraint FK_ETRE_MARIE foreign key (CODEMATRIMONIALE)
      references MATRIMONIALES (CODEMATRIMONIALE) on delete restrict on update restrict;

alter table ETUDIANTS add constraint FK_POSSEDER foreign key (CODENATIONALITE)
      references NATIONALITES (CODENATIONALITE) on delete restrict on update restrict;

alter table ETUDIANTS add constraint FK_RECONNAITRE foreign key (NUM_PERE)
      references PERES (NUM_PERE) on delete restrict on update restrict;

alter table ETUDIANTS add constraint FK_RECONNAITRE2 foreign key (NUM_MERE)
      references MERES (NUM_MERE) on delete restrict on update restrict;

alter table ETUDIANTS add constraint FK_RECONNAITRE3 foreign key (NUMMERE2)
      references TUTEURS (NUMMERE2) on delete restrict on update restrict;

alter table ETUDIANTS add constraint FK_VENIR foreign key (CODEPAYS)
      references PAYS (CODEPAYS) on delete restrict on update restrict;

alter table ETUDIANT_CANDIDATURE add constraint FK_ETUDIANT_CANDIDATURE foreign key (NUMETUDIANT)
      references ETUDIANTS (NUMETUDIANT) on delete restrict on update restrict;

alter table ETUDIANT_CANDIDATURE add constraint FK_ETUDIANT_CANDIDATURE2 foreign key (CODE_CANDIDATURE)
      references CANDIDATURE (CODE_CANDIDATURE) on delete restrict on update restrict;

alter table FILIERES add constraint FK_REGROOUPER foreign key (CODE_ECOLE)
      references ECOLE (CODE_ECOLE) on delete restrict on update restrict;

alter table INSCRIPTIONCONCOURS add constraint FK_CANDIDAT_INSCRIPTION foreign key (NUM_CANDIDAT)
      references CANDIDAT (NUM_CANDIDAT) on delete restrict on update restrict;

alter table INSCRIPTIONCONCOURS add constraint FK_INSCRIPTION_ANNEECONCOUR foreign key (CODE_ANNEES_CONCOURS)
      references ANNEECONCOURS (CODE_ANNEES_CONCOURS) on delete restrict on update restrict;

alter table INSCRIPTIONCONCOURS add constraint FK_INSCRIPTION_CONCOURR foreign key (CODE_CONCOURS)
      references CONCOURS (CODE_CONCOURS) on delete restrict on update restrict;

alter table INSCRIPTIONS add constraint FK_AVOIR_REGIME foreign key (CODE_REGIME)
      references REGIME (CODE_REGIME) on delete restrict on update restrict;

alter table INSCRIPTIONS add constraint FK_CONCERNER foreign key (CODE_SECTION)
      references SECTION (CODE_SECTION) on delete restrict on update restrict;

alter table INSCRIPTIONS add constraint FK_FAIRE foreign key (NUMETUDIANT)
      references ETUDIANTS (NUMETUDIANT) on delete restrict on update restrict;

alter table INSCRIPTIONS add constraint FK_LIER foreign key (CODE_ANNEES)
      references ANNEES (CODE_ANNEES) on delete restrict on update restrict;

alter table LOGER add constraint FK_LOGER foreign key (NUMETUDIANT)
      references ETUDIANTS (NUMETUDIANT) on delete restrict on update restrict;

alter table LOGER add constraint FK_LOGER2 foreign key (CODE_LOGE)
      references LOGEMENT (CODE_LOGE) on delete restrict on update restrict;

alter table MATIERE add constraint FK_RATTACHER foreign key (CODE_SECTION)
      references SECTION (CODE_SECTION) on delete restrict on update restrict;

alter table MATIERECONCOURS add constraint FK_CONCOURS_MATIERE foreign key (CODE_CONCOURS)
      references CONCOURS (CODE_CONCOURS) on delete restrict on update restrict;

alter table MATIERECONCOURS add constraint FK_ETRE_TYPE foreign key (CODE_TYPE_MATIERE)
      references TYPEMATIERECONCOURS (CODE_TYPE_MATIERE) on delete restrict on update restrict;

alter table MATIERE_EXAM add constraint FK_SECTION_MATIERE_EXAM foreign key (CODE_SECTION)
      references SECTION (CODE_SECTION) on delete restrict on update restrict;

alter table MERES add constraint FK_AVOIR_ADRESSE2 foreign key (CODE_ADRESSE)
      references ADRESSES (CODE_ADRESSE) on delete restrict on update restrict;

alter table MERES add constraint FK_AVOIR_PROFESSION2 foreign key (CODE_PROFESSION)
      references PROFESSIONS (CODE_PROFESSION) on delete restrict on update restrict;

alter table NOTECONCOURS add constraint FK_CANDIDAT_NOTE foreign key (NUM_CANDIDAT)
      references CANDIDAT (NUM_CANDIDAT) on delete restrict on update restrict;

alter table NOTECONCOURS add constraint FK_MATIERECONCOUR_NOTE foreign key (CODE_MATIERE_CONCOURS)
      references MATIERECONCOURS (CODE_MATIERE_CONCOURS) on delete restrict on update restrict;

alter table NOTES add constraint FK_ANNEES_NOTES foreign key (CODE_ANNEES)
      references ANNEES (CODE_ANNEES) on delete restrict on update restrict;

alter table NOTES add constraint FK_MATIERE_NOTES foreign key (CODE_MATIERE)
      references MATIERE (CODE_MATIERE) on delete restrict on update restrict;

alter table NOTES add constraint FK_OBTENIR foreign key (NUMETUDIANT)
      references ETUDIANTS (NUMETUDIANT) on delete restrict on update restrict;

alter table NOTES add constraint FK_SEMESTRE_NOTES foreign key (CODE_SEMESTRE)
      references SEMESTRE (CODE_SEMESTRE) on delete restrict on update restrict;

alter table NOTEXAM add constraint FK_ETUDIANT_NOTEXAM foreign key (NUMETUDIANT)
      references ETUDIANTS (NUMETUDIANT) on delete restrict on update restrict;

alter table NOTEXAM add constraint FK_MATIERE_EXAM_NOTEXAM foreign key (CODE_MATIERE_EXAM)
      references MATIERE_EXAM (CODE_MATIERE_EXAM) on delete restrict on update restrict;

alter table PARAMMATIERE add constraint FK_AVOIR_MATIERE foreign key (CODE_SECTION)
      references SECTION (CODE_SECTION) on delete restrict on update restrict;

alter table PARAMMATIERE add constraint FK_AVOIR_TYPE foreign key (CODE_TYPE)
      references TYPE_MATIERE (CODE_TYPE) on delete restrict on update restrict;

alter table PARAMMATIEREXAM add constraint FK_AVOIR_TYPE_EXAM foreign key (CODE_TYPE_EXAM)
      references TYPE_MATIERE_EXAM (CODE_TYPE_EXAM) on delete restrict on update restrict;

alter table PARAMMATIEREXAM add constraint FK_SECTION_PARAMMATIERE_EXAM foreign key (CODE_SECTION)
      references SECTION (CODE_SECTION) on delete restrict on update restrict;

alter table PERES add constraint FK_AVOIR_ADRESSE foreign key (CODE_ADRESSE)
      references ADRESSES (CODE_ADRESSE) on delete restrict on update restrict;

alter table PERES add constraint FK_AVOIR_PROFESSION foreign key (CODE_PROFESSION)
      references PROFESSIONS (CODE_PROFESSION) on delete restrict on update restrict;

alter table SCOLARITES add constraint FK_PAYER foreign key (NUMETUDIANT)
      references ETUDIANTS (NUMETUDIANT) on delete restrict on update restrict;

alter table SCOLARITES add constraint FK_SCOLARITE_ANNEE foreign key (CODE_ANNEES)
      references ANNEES (CODE_ANNEES) on delete restrict on update restrict;

alter table SECTION add constraint FK_APPARTENIR foreign key (CODE_FILIERE)
      references FILIERES (CODE_FILIERE) on delete restrict on update restrict;

alter table TUTEURS add constraint FK_AVOIR_ADRESSE3 foreign key (CODE_ADRESSE)
      references ADRESSES (CODE_ADRESSE) on delete restrict on update restrict;

alter table VERSEMENT add constraint FK_ACTIVITE_VERSEMENT foreign key (CODE_ACTIVITE)
      references ACTIVITES (CODE_ACTIVITE) on delete restrict on update restrict;

alter table VERSEMENT add constraint FK_EFFECTUER foreign key (NUMETUDIANT)
      references ETUDIANTS (NUMETUDIANT) on delete restrict on update restrict;

alter table VERSEMENT add constraint FK_MODE_VERSEMENT foreign key (CODE_MODE)
      references MODE (CODE_MODE) on delete restrict on update restrict;

alter table VERSEMENT add constraint FK_PROVENIR foreign key (CODE_ORIGINR)
      references ORIGINE (CODE_ORIGINR) on delete restrict on update restrict;

alter table VERSEMENT add constraint FK_VERSEMENT_ANNEE foreign key (CODE_ANNEES)
      references ANNEES (CODE_ANNEES) on delete restrict on update restrict;

