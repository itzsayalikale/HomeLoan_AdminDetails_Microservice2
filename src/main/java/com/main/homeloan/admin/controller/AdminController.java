package com.main.homeloan.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.homeloan.admin.model.AdminDetails;
import com.main.homeloan.admin.service.AdminService;

@RestController
@CrossOrigin("*")
@RequestMapping("/admindata")
public class AdminController {

	@Autowired
	private AdminService adminservice;
	
	//Save the data in AdminDetails
	@PostMapping("/saveData")
	public ResponseEntity<String> saveData(@RequestBody AdminDetails admindetails){
		String input=adminservice.saveData(admindetails);
		return new ResponseEntity<String>(input,HttpStatus.CREATED);
	}
	
	//Get Single Record  //Search By adminId
	@GetMapping("/getSingleData/{adminId}")
	public ResponseEntity<AdminDetails> getSingleRecord(@PathVariable int adminId){
		AdminDetails response=adminservice.getSingleRecord(adminId);
		return new ResponseEntity<AdminDetails>(response,HttpStatus.OK);
	}
	
	//Search By Username and Password
	@GetMapping("/searchByNamePassword/{userName}/{password}")
	public ResponseEntity<AdminDetails> getNamePassword(@PathVariable String userName,@PathVariable String password){
		AdminDetails responseup=adminservice.getByNamePassword(userName,password);
		return new ResponseEntity<AdminDetails>(responseup,HttpStatus.OK);
	}
}
