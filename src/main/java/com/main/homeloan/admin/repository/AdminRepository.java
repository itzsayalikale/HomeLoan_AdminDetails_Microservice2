package com.main.homeloan.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.homeloan.admin.model.AdminDetails;

@Repository
public interface AdminRepository extends JpaRepository<AdminDetails, Integer>{

	
	public AdminDetails findByUserNameAndPassword(String userName, String password);

	
}
