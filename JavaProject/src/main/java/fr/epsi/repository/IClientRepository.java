package fr.epsi.repository;

import org.springframework.data.repository.CrudRepository;

import fr.epsi.entites.Client;

public interface IClientRepository extends CrudRepository<Client, Long> {

}
