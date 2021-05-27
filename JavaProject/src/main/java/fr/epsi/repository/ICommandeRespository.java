package fr.epsi.repository;

import org.springframework.data.repository.CrudRepository;

import fr.epsi.entites.Commande;

public interface ICommandeRespository extends CrudRepository<Commande, Long> {

}
