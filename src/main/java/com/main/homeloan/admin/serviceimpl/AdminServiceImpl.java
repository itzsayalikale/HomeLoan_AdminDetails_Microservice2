package com.main.homeloan.admin.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.homeloan.admin.model.AdminDetails;
import com.main.homeloan.admin.repository.AdminRepository;
import com.main.homeloan.admin.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminrepository;

	@Override
	public String saveData(AdminDetails admindetails) {
		adminrepository.save(admindetails);
		return "Admin data Added";
	}

	@Override
	public AdminDetails getSingleRecord(int adminId) {
		Optional<AdminDetails> singlerecord=adminrepository.findById(adminId);
		return singlerecord.get();
	}

	@Override
	public AdminDetails getByNamePassword(String userName, String password) {
		AdminDetails records=adminrepository.findByUserNameAndPassword(userName,password);
		return records;
	}
}
