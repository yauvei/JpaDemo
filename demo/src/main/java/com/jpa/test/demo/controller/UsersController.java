package com.jpa.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.demo.model.Users;
import com.jpa.test.demo.repository.UsersRepository;

@RestController
@RequestMapping(value = "/test/users")
public class UsersController {

	@Autowired
	UsersRepository usersRepository;
	
	
	@GetMapping(value="/get")
	public List<Users> getAll(){
		return usersRepository.findAll();
	}
	
	@GetMapping(value="/hi")
	public String getIt(){
		return "Hello wolrd";
	}
	
	
	@RequestMapping("/add")	
	public Users updateUser2(){		
		Users user2=new Users();		
		user2.setId(1);		
		user2.setName("zhao");		
		user2.setSalary(2);		
		user2.setTeamName("zhaodui");
		return usersRepository.save(user2);	
	}
	
	@GetMapping(value="/del")
	public String delAll(){
		usersRepository.deleteAll();
		return "del all";
	}


	@PostMapping(value="/load")
	public List<Users> persist(@RequestBody final Users users){
		usersRepository.save(users);
		return usersRepository.findAll();
	}
}
