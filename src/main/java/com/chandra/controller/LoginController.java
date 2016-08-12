package com.chandra.controller;



import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.model.Logins;
import com.chandra.repository.LoginRepository;

@RestController
@RequestMapping("api/v1")
public class LoginController {
	
	@Autowired
	private LoginRepository loginRepository;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="logins",method=RequestMethod.GET)
	public List<Logins> list()
	{
		List<Logins> tempEmployees=loginRepository.findAll();
		printEmployees(tempEmployees);
		return tempEmployees;
	}
	

	public void printEmployees(List<Logins> employees)
	{
		for(Logins e:employees)
		{
			System.out.println("Username is :"+e.getUsername()+" Password is :"+e.getPassword());
		}
	}
}
