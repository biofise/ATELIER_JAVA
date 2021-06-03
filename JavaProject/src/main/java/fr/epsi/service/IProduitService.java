package fr.epsi.service;

import java.util.Collection;

import fr.epsi.entites.Client;
import fr.epsi.entites.Produit;

public interface IProduitService {
	
	
	//Produits
	
		public Collection<Produit> listerProduits();   //lister les produits..
		public Produit ajouterProduit(Produit produit);  //ajouter un produit
		public Client updateProduit(Produit produit);  //modifier un produit
		public void deleteProduit(Produit produit);    //supprimer un produit

}
