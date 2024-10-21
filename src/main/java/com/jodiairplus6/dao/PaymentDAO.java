package com.jodiairplus6.dao;

import java.util.List;

import com.jodiairplus6.dao.GenericDAO;
import com.jodiairplus6.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


