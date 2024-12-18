package com.uday.location.entities.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uday.location.entities.Location;
import com.uday.location.entities.repos.LocationRepository;
import com.uday.location.services.LocationServices;
import com.uday.location.utility.emailUtility;
//import com.uday.student.utillReport;

import jakarta.servlet.ServletContext;

@Controller //it is a web or mvc controller
public class LocationController {
	@Autowired
	LocationServices service;
	@Autowired
	emailUtility  email;
	@Autowired
	LocationRepository locationrepo;
	//@Autowired
	//utillReport utillrepo;
	//@Autowired
	//ServletContext sc;
	@RequestMapping("/showCreate")
	public String toCreate() {
		return "createLocation";
		
	}
	//here model map is used send data or msg to the ui 
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location,ModelMap model) {
		Location save = service.save(location); //@modelAttribute - its map the ui data to the controller
		String msg = "Location saved with the id:"+save.getId();
		model.addAttribute("msg",msg);
		
		email.emailSender("springuday35@gmail.com","add", "maslda");//email data is sending
		return "createLocation";
		
	}
	@RequestMapping("/displayLocation")
	public String displayLocations(ModelMap model) {
		List<Location> lists = service.getAllLocation();
		model.addAttribute("lists", lists);
		return "displayLocation";
	}
	@RequestMapping("deleteLocation")
	public String deleteLocation(@RequestParam("id") int id,ModelMap model) {
	//	Location locationById = service.getLocationById(id);
		Location location = new Location();
		location.setId(id);
		service.deleteLocation(location);
	     List<Location> lists= service.getAllLocation();
	     model.addAttribute("lists",lists);
		return "displayLocation";
		
	}
	@RequestMapping("/showUpdate")
	public String editLocation( @RequestParam("id") int id,ModelMap model) {
		Location location = service.getLocationById(id);
		//Location location = new Location();
		//location.setId(id);
		model.addAttribute("location", location);
		return "updateLocation";
		
	}
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location,ModelMap model) {
		service.update(location);
		List<Location> lists= service.getAllLocation();
	     model.addAttribute("lists",lists);
		return "displayLocation";
		
	}
	//@RequestMapping("/generatereport")
	//public String generateReport() {
		
		//String path=sc.getRealPath("/");
	//	List<Object[]> data = locationrepo.findTypeAndCountType();
		
		//utillrepo.generatePieChart(path, data);
		
	//	return "report";
		
//	}
	
	
	
	
	
	
	
	
	
}
