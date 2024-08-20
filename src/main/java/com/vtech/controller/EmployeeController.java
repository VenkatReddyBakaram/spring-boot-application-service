package com.vtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vtech.models.Employee;
import com.vtech.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("employee/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("getEmployee")
	@ResponseBody
	public Employee getEmployee() {
		Employee employee = employeeService.getEmployee();
		return employee;
	}

	@RequestMapping("postEmployee/{name}")
	@ResponseBody
	public Employee postEmployee(@RequestBody Employee employee, @PathVariable String name) {

		System.out.println("Name ::::" + name);
		System.out.println(employee.getEmpName());
		System.out.println(employee.getDesignation());

		return employee;
	}

	@RequestMapping("getDetails")
	public ModelAndView getDetails() {
		ModelAndView view = new ModelAndView();
		view.addObject("employeename", "Venkat Reddy Bakaram");
		view.setViewName("employee");
		return view;
	}

	@RequestMapping("getDetails1")
	public String getDetails1(HttpServletRequest request) {
		request.setAttribute("employeename", "Venkat Reddy Bakaram");
		return "employee";
	}

	@RequestMapping("registration")
	public String registration() {
		return "registration";
	}

}
