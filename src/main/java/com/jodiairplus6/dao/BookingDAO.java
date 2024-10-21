package com.jodiairplus6.dao;

import java.util.List;

import com.jodiairplus6.dao.GenericDAO;
import com.jodiairplus6.domain.Booking;





public interface BookingDAO extends GenericDAO<Booking, Integer> {
  
	List<Booking> findAll();
	






}


