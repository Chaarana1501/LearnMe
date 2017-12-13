package com.learnMe;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnMe.model.Client;
import com.learnMe.service.ApiRequestService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@RestController
@EnableAutoConfiguration
public class ApiRequestController {

    @Autowired
    private ApiRequestService apiRequestService;

    private static final Logger logger = LoggerFactory.getLogger(ApiRequestController.class);

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getHome() {
        logger.info("Api request received");

        Map<String, String> response = new HashMap<String, String>();
        try {
            Client client = new Client("mmo","momo");
            apiRequestService.create(client);
            logger.info("Client Added");
            response.put("status", "success");
        } catch (Exception e) {
            logger.error("Error occurred while trying to process api request", e);
            response.put("status", "fail");
        }

        return response;
    }
    
    
    @RequestMapping("/resource")
	  public Map<String,Object> home() {
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("id", UUID.randomUUID().toString());
	    model.put("content", "Hello World");
	    return model;
	  }
    
    
}
