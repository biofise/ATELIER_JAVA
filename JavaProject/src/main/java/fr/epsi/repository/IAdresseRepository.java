package fr.epsi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.epsi.entites.Adresse;

@Repository
public interface IAdresseRepository extends CrudRepository<Adresse, Long> {

}
