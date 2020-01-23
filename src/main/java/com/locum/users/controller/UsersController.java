package com.locum.users.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.locum.security.JwtGenerator;
import com.locum.users.model.DocInfo;
import com.locum.users.model.LocumVacancyInfo;
import com.locum.users.model.Users;
import com.locum.users.service.LocumVacancyService;
import com.locum.users.service.UsersService;

/*User Controller */
@RestController
public class UsersController {
	
	private JwtGenerator jwtGenerator;
	
	
	
	@RequestMapping("/hi")
	public String sayHi()
	{
		return "Hi";
	}	
	
	public UsersController(JwtGenerator jwtGenerator) {
		super();
		this.jwtGenerator = jwtGenerator;
	}

	@Autowired
	UsersService userService;
	
	
	
	@Autowired
	LocumVacancyService locumVacancyService;
	
	@RequestMapping(method=RequestMethod.POST, value="addUser")
	public Users addUser(@RequestBody @Valid Users user, HttpServletResponse response)
	{
		System.out.println("<-------------In Controller-------------->");
		
		/* Code for Password Encryption */
		String encodePassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
		user.setPassword(encodePassword);
		System.out.println("JWT Token: "+jwtGenerator.generate(user));
		System.out.println("<------------------------------------------------------------------------------------------>");
		response.setHeader("Token", jwtGenerator.generate(user));
		System.out.println("<------------------------------------------------------------------------------------------>");
		System.out.println("Line 1:-------->"+user.getUserAddress());
		//System.out.println("Line 1:"+user.getUserAddress().);
		System.out.println();
		
		Users savedUser = userService.addUser(user);
		
		return savedUser;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="login")
	public boolean login(@RequestBody Users user, HttpServletResponse response)
	{
		System.out.println("In Login-------------->"+user.contactNumber+ "Password:"+user.password);
		Users l = userService.userLogin(user.contactNumber);
		String pw = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
		
		System.out.println("DB Password"+l.password+" Password:"+user.password +"PW: "+pw);
		
		response.setHeader("Token", jwtGenerator.generate(user));
		
		if(BCrypt.checkpw(user.getPassword(), l.getPassword()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="addLocumVacancy")
	public LocumVacancyInfo locumVacancySave(@RequestBody LocumVacancyInfo locumVacancyInfo)
	{
		System.out.println("In Locum Vacancy Save"+locumVacancyInfo.getID()+", "+locumVacancyInfo.getUserID()+", "+locumVacancyInfo.getFromTime()+ ", "+locumVacancyInfo.getFromDate()+":Eligibility: "+locumVacancyInfo.getFromDate()+", HA: "+locumVacancyInfo.getUserID()+", HN"+locumVacancyInfo.getHospitalName());
		
		return locumVacancyService.addLocumVacancyInfo(locumVacancyInfo);
	}
	
	@RequestMapping(value="/vacanyPostedBy/{userId}", method=RequestMethod.GET)
	public List<LocumVacancyInfo> getLocumVacancyInfo(@PathVariable String userId)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		//System.out.println("In Get Locum"+locumVacancyService.getLocumVacancyInfo(id));
		
		DocInfo docInfo = restTemplate.getForObject("http://localhost:8082/getDoc", DocInfo.class);
		
		System.out.println("DocInfo---------------------->"+docInfo.name);
		
		System.out.println("userID: "+userId);
		return locumVacancyService.getLocumVacancyInfo(userId);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getAllVacancies")
	public List<LocumVacancyInfo> getAllVacancies()
	{
		return locumVacancyService.getAllVacancies();
	}
		
}
