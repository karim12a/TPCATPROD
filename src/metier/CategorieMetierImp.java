package metier;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap ;

import metier.entities.Categorie;
import metier.entities.Produit;

public class CategorieMetierImp implements ICategorieMetier {
	
	private Map<Integer, Produit> listProduits = new HashMap<>();
	private Map<Integer, Categorie> listCategorie = new HashMap<>();
	

	@Override
	public Categorie addCategorie(Categorie ct) {
		// TODO Auto-generated method stub
		listCategorie.put(ct.getIdentifiant(), ct);
		return ct;
	}

	@Override
	public Produit addProduit(Produit pd) {
		// TODO Auto-generated method stub
		listProduits.put(pd.getIdProduit(), pd);
		return pd;
	}

	@Override
	public List<Categorie> listCategorie() {
		// TODO Auto-generated method stub
		
		return new ArrayList<>(listCategorie.values());
	}

	@Override
	public List<Produit> produitsParCat(int idCat) {
		// TODO Auto-generated method stub
		ArrayList<Produit> listProduitCat = new ArrayList<Produit>();
		for(Produit p:listProduits.values())
			if(p.getCategory().getIdentifiant()==idCat)
				listProduitCat.add(p);
		
			
		return listProduitCat;
		 
	}

	@Override
	public List<Produit> listProduits() {
		// TODO Auto-generated method stub
		return new ArrayList<Produit>(listProduits.values());
		
		
	}

	@Override
	public Categorie detailsCategorie(int idCat) {
		// TODO Auto-generated method stub
		return listCategorie.get(idCat);
		
	}

	@Override
	public Produit detailProduit(int idPrd) {
		// TODO Auto-generated method stub
		return listProduits.get(idPrd);
		
	}

	@Override
	public Categorie updateCategorie(int idCat, Categorie ct) {
		// TODO Auto-generated method stub
		
		listCategorie.put(idCat, ct);
		return ct;
	}

	@Override
	public Produit updateProduit(int idPrd, Produit prd) {
		// TODO Auto-generated method stub
		listProduits.put(idPrd, prd);
		return prd;
		
	}

	@Override
	public Categorie getCategorie() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Produit> getProduitMC(String mc) {
		// TODO Auto-generated method stub
		ArrayList<Produit> prdmc = new ArrayList<Produit>();
		for(Produit p :listProduits.values())
			if(p.getDesignation().contains(mc))
				prdmc.add(p);
				
	
		return prdmc ;
	}

	@Override
	public Boolean DeleteProduit(int idP) {
		// TODO Auto-generated method stub
		
		if(listProduits.get(idP)  != null) {
		listProduits.remove(idP);
		return true;
		}
		else throw new RuntimeException("produit introuvable");
			
			
	}
	
	public void initialisecatalogue() {
		
		addCategorie(new Categorie(1,"ordinateurs","ordinateurs.jpg"));
		addCategorie(new Categorie(2,"imprimentes","imprimentes.jpg"));
		addCategorie(new Categorie(3,"scanners","scanners.jpg"));
		
		
		//produit
		//addProduit(new Produit(1,"hp ord", "hp.jpg", 5000.0,detailsCategorie(1)));
		listProduits.put(1, new Produit(1,"hp ord", "hp.jpg", 5000.0,detailsCategorie(1)));
		listProduits.put(2, new Produit(2,"del ord", "hp.jpg", 6000.0,detailsCategorie(1)));
		listProduits.put(3, new Produit(3,"ibm ord", "hp.jpg", 4400.0,detailsCategorie(2)));
		listProduits.put(4, new Produit(4,"hp ord", "hp.jpg", 15000.0,detailsCategorie(2)));
		listProduits.put(5, new Produit(5,"del ord", "hp.jpg", 16000.0,detailsCategorie(2)));
		listProduits.put(6, new Produit(6,"ibm ord", "hp.jpg", 14400.0,detailsCategorie(3)));
		
	}

}
