package com.marvel.reports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marvel.reports.Dao.UserDAO;
import com.marvel.reports.model.User;

@RestController
public class Register {
	
	@Autowired
	public UserDAO dao;


	@RequestMapping("/register")
public List<User> customerInformation() {
		
		List<User> users = dao.isData();		 
		
		return users;
	}
}
