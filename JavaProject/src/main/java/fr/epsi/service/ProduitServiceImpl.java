package fr.epsi.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.entites.Client;
import fr.epsi.entites.Produit;
import fr.epsi.repository.IProduitRepository;


@Service
public class ProduitServiceImpl implements IProduitService {
	
	
	@Autowired
	IProduitRepository produitRepository;

	@Override
	public Collection<Produit> listerProduits() {
		
		return (Collection<Produit>) produitRepository.findAll();
	}

	@Override
	public Produit ajouterProduit(Produit produit) {
		return produitRepository.save(produit);
		

	}

	@Override
	public Client updateProduit(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(Produit produit) {
		// TODO Auto-generated method stub

	}

}
