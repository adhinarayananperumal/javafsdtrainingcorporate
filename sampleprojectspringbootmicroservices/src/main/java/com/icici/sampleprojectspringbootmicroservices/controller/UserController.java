package com.icici.sampleprojectspringbootmicroservices.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.sampleprojectspringbootmicroservices.entity.LoginHistory;
import com.icici.sampleprojectspringbootmicroservices.entity.User;
import com.icici.sampleprojectspringbootmicroservices.pojo.UserPojo;
import com.icici.sampleprojectspringbootmicroservices.repository.LoginHistoryRepository;
import com.icici.sampleprojectspringbootmicroservices.repository.UserRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	LoginHistoryRepository loginHistoryRepository;

	@PostMapping(value = "/save")
	public UserPojo saveUser(@RequestBody UserPojo userPojo) {
		System.out.println("from save nehr controller");

		User user = new User();

		user.setUserFullName(userPojo.getUserFullName());
		user.setPassword(userPojo.getPassword());

		LocalDateTime instant = LocalDateTime.now();

		user.setLastLoginTimeStamp(instant);
		user = userRepository.save(user);

		userPojo.setUserId(user.getUserId());
		userPojo.setLastLoginTimeStamp(user.getLastLoginTimeStamp());
		return userPojo;
	}

	@PostMapping("/validateLogin")
	public String validateLogin(@RequestBody UserPojo nehrPojo) {

		try {
			User user = userRepository.getReferenceById(nehrPojo.getUserId());

			LoginHistory loginHistory = new LoginHistory();

			loginHistory.setUser(user);

			LocalDateTime instant = LocalDateTime.now();
			loginHistory.setLastLoginTimeStamp(instant);

			if (nehrPojo.getUserId() == user.getUserId() && nehrPojo.getPassword().equals(user.getPassword())) {
				loginHistory.setStatus("success");
				loginHistoryRepository.save(loginHistory);
				return "s";
			} else {
				loginHistory.setStatus("fail");
				loginHistoryRepository.save(loginHistory);
				return "f";
			}

		} catch (Exception e) {
			return "f";
		} finally {
		}
	}

	@GetMapping("/get/{userId}")
	public UserPojo listNehr(@PathVariable int userId) {
		User user = userRepository.getReferenceById(userId);

		UserPojo userPojo = new UserPojo();

		userPojo.setUserId(user.getUserId());
		userPojo.setUserFullName(user.getUserFullName());
		userPojo.setLastLoginTimeStamp(user.getLastLoginTimeStamp());

		List<LoginHistory> listLoginHistory = new ArrayList<LoginHistory>();

		for (LoginHistory userent : user.getLoginHistory()) {
			LoginHistory loginHistory = new LoginHistory();
			loginHistory.setId(userent.getId());
			loginHistory.setLastLoginTimeStamp(userent.getLastLoginTimeStamp());
			loginHistory.setStatus(userent.getStatus());
			
			listLoginHistory.add(loginHistory);
		}

		userPojo.setListLoginHistory(listLoginHistory);
		return userPojo;
	}

}
