package com.jodiairplus6.dao;

import java.util.List;

import com.jodiairplus6.dao.GenericDAO;
import com.jodiairplus6.domain.Luggage;





public interface LuggageDAO extends GenericDAO<Luggage, Integer> {
  
	List<Luggage> findAll();
	






}


