package com.uday.location.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uday.location.entities.Location;
import com.uday.location.entities.repos.LocationRepository;
import com.uday.location.services.LocationServices;
@Service
public class LocationServicesImpl implements LocationServices {
	@Autowired
	private	LocationRepository repos;

	@Override
	public Location save(Location location) {
		return repos.save(location);
	}

	@Override
	public Location update(Location location) {
		return repos.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repos.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		return repos.findById(id).get();
	}

	@Override
	public List<Location> getAllLocation() {
		return repos.findAll();
	}
	
}
