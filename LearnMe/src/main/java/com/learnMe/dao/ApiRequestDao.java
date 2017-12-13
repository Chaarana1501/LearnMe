package com.learnMe.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.learnMe.model.Client;

@Repository

public class ApiRequestDao {

 @PersistenceContext

 private EntityManager entityManager;

 public void create(Client client) {

 entityManager.persist(client);

 }

 public void update(Client client) {

 entityManager.merge(client);

 }

 public Client getClientId(long id) {

 return entityManager.find(Client.class, id);

 }

 

  

 public void delete(long id) {

	 Client client = getClientId(id);

 if (client != null) {

 entityManager.remove(client);

 }

 }
}
