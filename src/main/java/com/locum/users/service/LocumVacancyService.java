package com.locum.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locum.users.model.LocumVacancyInfo;
import com.locum.users.repository.LocumVacancyRepository;

@Service
public class LocumVacancyService {
	
	@Autowired
	LocumVacancyRepository locumVacancyRepository;
	
	public LocumVacancyInfo addLocumVacancyInfo(LocumVacancyInfo locumVacancyInfo)
	{
		System.out.println("Locum Vacancy Info");
		
		return locumVacancyRepository.save(locumVacancyInfo);
	}
	
	public List<LocumVacancyInfo> getLocumVacancyInfo(String userId)
	{
		System.out.println(" Result : "+locumVacancyRepository.findByUserID(userId)+":: UserID:: "+userId);
		//System.out.println("Result By Id:"+locumVacancyRepository.findById(Long.parseLong(id)));
		return locumVacancyRepository.findByUserID(userId);
	}
	
}
