package fr.epsi.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.epsi.entites.Client;
import fr.epsi.entites.Produit;
import fr.epsi.repository.IProduitRepository;


@Service
@Transactional
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
	public Produit updateProduit(Produit produit) {
		
		return produitRepository.save(produit);
	}

	@Override
	public void deleteProduit(Long id) {
		if(produitRepository.existsById(id)) {
			produitRepository.deleteById(id);
		}
		else {
			throw new RuntimeException("Produit inexistant");
		}
	}

}
