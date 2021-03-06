package com.springboot.jersey.springbootjerseyhelloworld.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.jersey.springbootjerseyhelloworld.model.User;
import com.springboot.jersey.springbootjerseyhelloworld.service.UserService;
 
@Component
@Path("/users")
public class JerseyEndpoint {
	@Autowired
	private UserService userService;
	 
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getEventVersion1(@PathParam("id") String id) {
	  return userService.findById(id);
	}
}