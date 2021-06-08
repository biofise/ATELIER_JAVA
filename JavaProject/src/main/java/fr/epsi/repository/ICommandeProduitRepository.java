package fr.epsi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.epsi.entites.CommandeProduit;


@Repository
public interface ICommandeProduitRepository extends CrudRepository<CommandeProduit , Long> {
	
	
	public CommandeProduit findByQuantite(int quantite);
	
	

}
