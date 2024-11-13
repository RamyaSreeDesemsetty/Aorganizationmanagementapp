package com.cg.Aorganizationmanagementapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Aorganizationmanagementapp.dto.DepartmentsDto;
import com.cg.Aorganizationmanagementapp.entities.Departments;
import com.cg.Aorganizationmanagementapp.services.DepartmentsService;
import com.cg.Aorganizationmanagementapp.services.EmployeesService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/orgdepartments")
public class DepartmentController {

	private DepartmentsService departmentServivce;
	private EmployeesService empService;

	@PostMapping("/create")
	public void createDepartment(@RequestBody DepartmentsDto departmentDto) {
		departmentServivce.addDepartment(departmentDto);
	}

	@GetMapping("/employees/{employeeId}/department")
	public Departments getDepartmentByEmployeeId(@PathVariable Long employeeId) {
		return empService.getDepartmentByEmployeeId(employeeId);
	}


}
