package com.locum.users.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locum.users.model.LocumVacancyInfo;


@Repository
public interface LocumVacancyRepository extends JpaRepository<LocumVacancyInfo, Serializable> {
	public List<LocumVacancyInfo> findByUserID(String userID);
	
	public LocumVacancyInfo findById(long Id);

}
