package com.learnMe.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learnMe.dao.ApiRequestDao;
import com.learnMe.model.Client;

@Transactional
@Service
public class ApiRequestService {

@Autowired
 private ApiRequestDao apiRequestDao;

 

 public void create(Client client) {

 apiRequestDao.create(client);

 }

}

