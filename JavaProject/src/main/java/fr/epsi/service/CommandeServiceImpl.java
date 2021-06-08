package fr.epsi.service;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.epsi.entites.Commande;
import fr.epsi.repository.ICommandeRespository;


@Service
@Transactional
public class CommandeServiceImpl implements ICommandeService {
	
	
	@Autowired
	ICommandeRespository commandeRepository;

	@Override
	public Collection<Commande> listerCommandes() {
		
		return (Collection<Commande>) commandeRepository.findAll();
	}

	@Override
	public Commande ajouterCommande(Commande commande) {
		commande.setDate(new Date());
		return commandeRepository.save(commande);
	

	}

	@Override
	public Commande updateCommande(Commande commande) {
		
		return commandeRepository.save(commande);
	}

	@Override
	public void deleteCommande(Long id) {
		if(commandeRepository.existsById(id)) {
			commandeRepository.deleteById(id);
		}
		else {
			throw new RuntimeException("Commande inexistante");
		}
		

	}

}
