package com.jodiairplus6.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.jodiairplus6.domain.CrewMember;
import com.jodiairplus6.dto.CrewMemberDTO;
import com.jodiairplus6.dto.CrewMemberSearchDTO;
import com.jodiairplus6.dto.CrewMemberPageDTO;
import com.jodiairplus6.dto.CrewMemberConvertCriteriaDTO;
import com.jodiairplus6.service.GenericService;
import com.jodiairplus6.dto.common.RequestDTO;
import com.jodiairplus6.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CrewMemberService extends GenericService<CrewMember, Integer> {

	List<CrewMember> findAll();

	ResultDTO addCrewMember(CrewMemberDTO crewMemberDTO, RequestDTO requestDTO);

	ResultDTO updateCrewMember(CrewMemberDTO crewMemberDTO, RequestDTO requestDTO);

    Page<CrewMember> getAllCrewMembers(Pageable pageable);

    Page<CrewMember> getAllCrewMembers(Specification<CrewMember> spec, Pageable pageable);

	ResponseEntity<CrewMemberPageDTO> getCrewMembers(CrewMemberSearchDTO crewMemberSearchDTO);
	
	List<CrewMemberDTO> convertCrewMembersToCrewMemberDTOs(List<CrewMember> crewMembers, CrewMemberConvertCriteriaDTO convertCriteria);

	CrewMemberDTO getCrewMemberDTOById(Integer crewMemberId);







}





