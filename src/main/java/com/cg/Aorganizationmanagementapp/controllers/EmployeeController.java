package com.cg.Aorganizationmanagementapp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Aorganizationmanagementapp.dto.EmployeesDto;
import com.cg.Aorganizationmanagementapp.services.EmployeesService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/orgemployees")
public class EmployeeController {

	private EmployeesService empService;

	@PostMapping("/create")
	public void createEmployee(@RequestBody EmployeesDto empDto) {
		empService.addEmployee(empDto);

	}
	/*
	 * @GetMapping("/employees/{employeeId}/department")
	 * 
	 * public Departments getDepartmentByEmployeeId(@PathVariable Long employeeId) {
	 * return empService.getDepartmentByEmployeeId(employeeId); }
	 */

}
