package com.employee.managementproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.managementproject.model.Employee;
import com.employee.managementproject.service.EmployeeService;

import ch.qos.logback.core.model.Model;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	// display list of employees
	@GetMapping
	public String viewHomePage(Model model) {
		
		
		return findPaginated(1,"firstname","asc",model);
		}
	
	
	
	
	
	
	
	
	@GetMapping
	private String findPaginated(@PathVariable(value = "pageNo")int  pageNo,@RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir, Model model) {
		// TODO Auto-generated method stub
		int pageSize=5;
		Page<Employee> page = employeeService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Employee>   listemployee =page.getContent();
				model.addAttribute();
				model.addAttribute();
				model.addAttribute();
				model.addAttribute();
				model.addAttribute();
				model.addAttribute();
				model.addAttribute();
			
		
		
		return "index";
	}
	@GetMapping
	public Employee showNewEmployeeForm(Model model) {
		// create model attribute to bind form data
		
		Employee employee=new Employee();
			model.addText("new employee");
		
		return employee;
		}
	@GetMapping
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		// save employee to database
		employeeService.saveEmployee(employee);
		return "redirect:/";
		}
	@GetMapping
	public Employee showFormForUpdate(@PathVariable(value = "id")long id, Model model) {
		Employee employee =  employeeService.getEmployeeById(id);
		
		// set employee as a model attribute to pre-populate the form
		model.addText("employee");
		return employee;
		}
	
	@GetMapping
	public String deleteEmployee(@PathVariable(value = "id")long id) {
		this.employeeService.deleteEmployeeById(id);
		
		
		return "redirect:/";
		}
	
}
