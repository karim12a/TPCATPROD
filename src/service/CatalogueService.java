package service;

import java.util.List;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.org.glassfish.gmbal.ParameterNames;

import metier.CategorieMetierImp;
import metier.entities.Categorie;
import metier.entities.Produit;
@Path ("/catalogue")
public class CatalogueService {
	
	private CategorieMetierImp metier;
	
	public CatalogueService() {
		
		metier = new CategorieMetierImp();
		metier.initialisecatalogue();
	}
	@GET
	@Path("/categories")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Categorie> consulterCategorie()
	{
		return metier.listCategorie();
		
	}
	@GET
	@Path("/detailCat/{idCat}")
	@Produces(MediaType.APPLICATION_JSON)
	public Categorie detailsCategorie(@PathParam("idCat") int idCat)
	{
		return metier.detailsCategorie(idCat);
	}
	
	@GET
	@Path("/categories/{idCat}/produit")
	@Produces(MediaType.APPLICATION_JSON)
	//liste de produits pas categorie
	public List<Produit> detailProduitCat(@PathParam("idCat") int idCat)
	{
		
		return metier.produitsParCat(idCat);
		
	}

}
