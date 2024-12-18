package com.uday.location.entities.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uday.location.entities.Location;
import com.uday.location.entities.repos.LocationRepository;

@RestController  // to know the spring it is a rest controller
@RequestMapping("/locations") // all client requests point to the locations.this all deal with the restcontroller
public class locationRestController {
	@Autowired
	LocationRepository locrepo;//here we are not writeing the logic thats why we using locationrepository class otherwise we use the service class
	@GetMapping
	public List<Location> findAll(){
		return locrepo.findAll();
		
	}
	@PostMapping  //spring binds the postmapping to the create method the endpoint is location
	public Location createLocation(@RequestBody Location location) {//@requetsbody is done deserialtion  thst means request come in json then coverts into object and save into database
		return locrepo.save(location);
		}
	@PutMapping
	public Location updateLocation(@RequestBody Location location) {
		
		return locrepo.save(location);
	}
	@DeleteMapping("/{id}")
	public void delectLocation(@PathVariable("id") int id) {
	 //return locrepo.delete(id);
	}
	@GetMapping("/{id}")
	public Location getLocation(@PathVariable int id) {
		return locrepo.findById(id).get()	;	
	}
	
	
	
}
