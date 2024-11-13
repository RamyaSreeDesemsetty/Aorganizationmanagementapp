package com.cg.Aorganizationmanagementapp.services;

import com.cg.Aorganizationmanagementapp.dto.EmployeesDto;
import com.cg.Aorganizationmanagementapp.entities.Departments;

public interface EmployeesService {

	void addEmployee(EmployeesDto empDto);

	Departments getDepartmentByEmployeeId(Long employeeId);

}
