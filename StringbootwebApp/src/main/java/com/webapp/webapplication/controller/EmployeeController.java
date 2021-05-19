package com.webapp.webapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.webapp.webapplication.model.Employee;
import com.webapp.webapplication.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	//@GetMapping("/employee")
	//public List<Employee> get(){
		//return employeeService.get();
	///}
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("employeesList");
		mav.addObject("list", employeeService.get());
		return mav;
	}
	
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute("employee") Employee employeeObj) {
		ModelAndView mav = new ModelAndView("employeesList");
		employeeService.save(employeeObj);
		mav.addObject("list", employeeService.get());
		return mav;
	}
	@GetMapping("/employee/{id}")
	public Employee get(@PathVariable int id) {
		Employee employeeObj = employeeService.get(id);
		if(employeeObj == null) {
			throw new RuntimeException("Employee with id "+id+" is not found");
		}
		return employeeObj;
	}
	
	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("employeesList");
		employeeService.delete(id);
		mav.addObject("list", employeeService.get());
		return mav;
	}
	
	@RequestMapping("/showEmployeeForm")
	public ModelAndView showEmployeeForm()  {
		ModelAndView mav = new ModelAndView("employeesAdd");
		mav.addObject("employee", new Employee());
		return mav;
	}
	
	@PutMapping("/employee")
	public Employee update(@RequestBody Employee employeeObj) {
		employeeService.save(employeeObj);
		return employeeObj;
	}
}
