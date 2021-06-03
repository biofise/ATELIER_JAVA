package fr.epsi.restcontroller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fr.epsi.entites.Client;
import fr.epsi.entites.Produit;
import fr.epsi.service.IProduitService;

@Controller
//@RequestMapping("produits")
public class ProduitRestController {

	
	@Autowired
	IProduitService produitService;

	
	
	//@Get
	public Collection<Produit> listerProduits() {
		return produitService.listerProduits();
	}

	
	
	public Produit ajouterProduit(Produit produit) {
		return produitService.ajouterProduit(produit);
	}

	public Client updateProduit(Produit produit) {
		return produitService.updateProduit(produit);
	}

	public void deleteProduit(Produit produit) {
		produitService.deleteProduit(produit);
	}
}
