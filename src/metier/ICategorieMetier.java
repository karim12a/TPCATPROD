package metier;

import java.util.List;

import metier.entities.Categorie;
import metier.entities.Produit;

public interface ICategorieMetier {
	
	public Categorie addCategorie(Categorie ct);
	public Produit addProduit(Produit pd);
	public List<Categorie> listCategorie();
	public List<Produit> produitsParCat(int idCat);
	public List<Produit> listProduits();
	public Categorie detailsCategorie(int idCat);
	public Produit detailProduit(int idPrd);
	public Categorie updateCategorie(int idCat, Categorie ct);
	public Produit updateProduit(int idPrd, Produit prd);
	public Categorie getCategorie();
	public List<Produit> getProduitMC(String mc);
	public Boolean DeleteProduit(int idP);
	
	
	
	
	
	

}
