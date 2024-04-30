package MASTER.SI.SPRING.AP08.modele;
import org.springframework.data.annotation.Id;
public class Wilaya{
	    @Id
	    private int id;
	    private  boolean actif;
	    private  int compteCreation;
	    private  int compteMaj;
	    private  String dateCreation;
	    private  String dateMaj;
	    private  String nomArabe;
	    private  String nom_latin;
	    private  String nom_tamazight;
		public Wilaya() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public boolean isActif() {
			return actif;
		}
		public void setActif(boolean actif) {
			this.actif = actif;
		}
		public int getCompteCreation() {
			return compteCreation;
		}
		public void setCompteCreation(int compteCreation) {
			this.compteCreation = compteCreation;
		}
		public int getCompteMaj() {
			return compteMaj;
		}
		public void setCompteMaj(int compteMaj) {
			this.compteMaj = compteMaj;
		}
		public String getDateCreation() {
			return dateCreation;
		}
		public void setDateCreation(String dateCreation) {
			this.dateCreation = dateCreation;
		}
		public String getDateMaj() {
			return dateMaj;
		}
		public void setDateMaj(String dateMaj) {
			this.dateMaj = dateMaj;
		}
		public String getNomArabe() {
			return nomArabe;
		}
		public void setNomArabe(String nomArabe) {
			this.nomArabe = nomArabe;
		}
		public String getNom_latin() {
			return nom_latin;
		}
		public void setNom_latin(String nom_latin) {
			this.nom_latin = nom_latin;
		}
		public String getNom_tamazight() {
			return nom_tamazight;
		}
		public void setNom_tamazight(String nom_tamazight) {
			this.nom_tamazight = nom_tamazight;
		}
}
