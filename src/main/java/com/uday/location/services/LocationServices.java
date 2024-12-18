package com.uday.location.services;

import java.util.List;

import com.uday.location.entities.Location;

public interface LocationServices {

	Location save(Location location);
	Location update(Location location);
	void deleteLocation(Location location);
	Location getLocationById(int id);
	List<Location> getAllLocation();
	
	
}
