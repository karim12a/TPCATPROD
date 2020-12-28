package metier.entities;

import java.io.Serializable;

public class Produit implements Serializable {
	private int idProduit;
	private String designation ;
	private String photo;
	private double prix;
	private Categorie category;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(int idCategory, String designation, String photo, double prix, Categorie category) {
		super();
		this.idProduit = idCategory;
		this.designation = designation;
		this.photo = photo;
		this.prix = prix;
		this.category = category;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idCategory) {
		this.idProduit = idCategory;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Categorie getCategory() {
		return category;
	}

	public void setCategory(Categorie category) {
		this.category = category;
	}

	
}
