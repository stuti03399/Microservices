package com.tcs.webservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.tcs.webservice.entity.Employee;

@RestController
public class MyController {
	
@RequestMapping("/Welcome")
	public String welcome() {
		return "Welcome to spring boot";
	}

@RequestMapping("/hello")
public String hello() {
	return "Welcome to REST based web service";
}

@GetMapping("/user/{arg}")
public String display(@PathVariable String arg) {
	return "Welcome " +arg+ " to spring boot app";
}
// @GetMapping("/user?name={value}")
// public String show(@PathParam(value = "name") String name) {
//return "Welcome user " +name+ " to REST web service";
//}

@GetMapping("/employee")
public Employee getEmployee() {
	return new Employee(100, "Test", "Test@gmail.com");
}

@GetMapping("/employees")
public List<Employee> getEmployees() {
	List<Employee> employeeList = new ArrayList<Employee>();
	employeeList.add(new Employee(101, "Test", "Test@gmail.com"));
	employeeList.add(new Employee(102, "Abcd", "abcd@gmail.com"));
	employeeList.add(new Employee(103, "Xyz", "xyz@gmail.com"));
	employeeList.add(new Employee(104, "Lmn", "lmn@gmail.com"));
	employeeList.add(new Employee(105, "BCD", "bcd@gmail.com"));
	return employeeList;
}
}