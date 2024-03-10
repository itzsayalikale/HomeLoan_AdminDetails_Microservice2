package com.main.homeloan.admin.service;

import com.main.homeloan.admin.model.AdminDetails;

public interface AdminService {

	public String saveData(AdminDetails admindetails);

	public AdminDetails getSingleRecord(int adminId);

	public AdminDetails getByNamePassword(String userName, String password);

}
