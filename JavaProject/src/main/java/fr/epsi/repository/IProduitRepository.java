package fr.epsi.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

import fr.epsi.entites.Produit;


@Repository
public interface IProduitRepository extends CrudRepository<Produit, Long> {
	
	//@RestResource(path = "parNom")
	public List<Produit> findByNom( String nom);
	
	
	public Produit findByPrix(double prix);

}
