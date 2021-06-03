package fr.epsi.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.entites.Commande;
import fr.epsi.repository.ICommandeRespository;


@Service
public class CommandeServiceImpl implements ICommandeService {
	
	
	@Autowired
	ICommandeRespository commandeRepository;

	@Override
	public Collection<Commande> listerCommandes() {
		
		return (Collection<Commande>) commandeRepository.findAll();
	}

	@Override
	public Commande ajouterCommande(Commande commande) {
		return commandeRepository.save(commande);
	

	}

	@Override
	public Commande updateCommande(Commande commande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCommande(Commande commande) {
		// TODO Auto-generated method stub

	}

}
