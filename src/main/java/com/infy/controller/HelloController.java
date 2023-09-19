package com.infy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.model.Address;
import com.infy.model.Employee;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Welcome to my Spring boot project...!!";
	}

	@GetMapping("/employee")
	public ResponseEntity<Employee> getEmployee() {

		Employee emp = new Employee(10, "Narendra", new Address("Pune"));

		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
}
