package metier.entities;

import java.io.Serializable;

public class Categorie implements Serializable{
	
	private int identifiant ;
	private String nom;
	private String photo;
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(int identifiant, String nom, String photo) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.photo = photo;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

}
