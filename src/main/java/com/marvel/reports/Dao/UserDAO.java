package com.marvel.reports.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.marvel.reports.model.User;

@Repository
public class UserDAO {
	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SQL = "select * from user";
	
public List<User> isData() {
		
		List<User> customers = new ArrayList<User>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);
		
		for (Map<String, Object> row : rows) {
			User customer = new User();
			
			customer.setEmpId((Integer) row.get("empid"));
			
			customer.setName((String) row.get("name"));
			customers.add(customer);
		}

		return customers;
		
	}


}
