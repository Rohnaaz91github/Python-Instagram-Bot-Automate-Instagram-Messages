package com.mastek.insurance.service.controller;

import java.util.Scanner;

import org.eclipse.jdt.core.compiler.InvalidInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.insurance.model.User;
import com.mastek.insurance.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) throws InvalidInputException {

		User users = userService.saveUser(user);

		System.out.println("Enter username");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		System.out.println("Enter password");
		String passWord = scanner.next();

		if (userName.equals(user.getUsername()) && (passWord.equals(user.getPassword()))) {
			System.out.println("login Successfull");

		} else {
			throw new InvalidInputException("username and password is invalid");
			
		}
		return ResponseEntity.ok().body(users);

	}
}
