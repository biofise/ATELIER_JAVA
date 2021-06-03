package fr.epsi.repository;

import org.springframework.data.repository.CrudRepository;

import fr.epsi.entites.CommandeProduit;

public interface ICommandeProduitRepository extends CrudRepository<CommandeProduit , Long> {

}
