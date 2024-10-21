package com.jodiairplus6.dao;

import java.util.List;

import com.jodiairplus6.dao.GenericDAO;
import com.jodiairplus6.domain.Airline;





public interface AirlineDAO extends GenericDAO<Airline, Integer> {
  
	List<Airline> findAll();
	






}


