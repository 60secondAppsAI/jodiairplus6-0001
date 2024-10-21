package com.jodiairplus6.dao;

import java.util.List;

import com.jodiairplus6.dao.GenericDAO;
import com.jodiairplus6.domain.Passenger;





public interface PassengerDAO extends GenericDAO<Passenger, Integer> {
  
	List<Passenger> findAll();
	






}


