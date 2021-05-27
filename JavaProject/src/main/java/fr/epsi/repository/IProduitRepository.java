package fr.epsi.repository;

import org.springframework.data.repository.CrudRepository;

import fr.epsi.entites.Produit;

public interface IProduitRepository extends CrudRepository<Produit, Long> {

}
