package com.uday.location.entities.repos;

import org.springframework.data.jpa.repository.JpaRepository;

//import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.uday.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
	//third pary api use in utility class like reports(pie chart ,bar chart)
	//@Query("select type,count(type) from location group by type")  //it is a jpa query aganiest into the object it didn't aganiest to database .hybernate is internaly connvert the object innto entityies ( data bas)e
	//public List<Object[]> findTypeAndCountType();
	
	// here geting the dataset store in list 
}
