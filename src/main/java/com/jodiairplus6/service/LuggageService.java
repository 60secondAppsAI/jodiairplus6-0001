package com.jodiairplus6.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.jodiairplus6.domain.Luggage;
import com.jodiairplus6.dto.LuggageDTO;
import com.jodiairplus6.dto.LuggageSearchDTO;
import com.jodiairplus6.dto.LuggagePageDTO;
import com.jodiairplus6.dto.LuggageConvertCriteriaDTO;
import com.jodiairplus6.service.GenericService;
import com.jodiairplus6.dto.common.RequestDTO;
import com.jodiairplus6.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface LuggageService extends GenericService<Luggage, Integer> {

	List<Luggage> findAll();

	ResultDTO addLuggage(LuggageDTO luggageDTO, RequestDTO requestDTO);

	ResultDTO updateLuggage(LuggageDTO luggageDTO, RequestDTO requestDTO);

    Page<Luggage> getAllLuggages(Pageable pageable);

    Page<Luggage> getAllLuggages(Specification<Luggage> spec, Pageable pageable);

	ResponseEntity<LuggagePageDTO> getLuggages(LuggageSearchDTO luggageSearchDTO);
	
	List<LuggageDTO> convertLuggagesToLuggageDTOs(List<Luggage> luggages, LuggageConvertCriteriaDTO convertCriteria);

	LuggageDTO getLuggageDTOById(Integer luggageId);







}





