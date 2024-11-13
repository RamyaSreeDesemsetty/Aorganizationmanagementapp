package com.cg.Aorganizationmanagementapp.serviceimpl;

import org.springframework.stereotype.Service;

import com.cg.Aorganizationmanagementapp.dto.EmployeesDto;
import com.cg.Aorganizationmanagementapp.entities.Departments;
import com.cg.Aorganizationmanagementapp.entities.Employees;
import com.cg.Aorganizationmanagementapp.mapper.EmployeesMapper;
import com.cg.Aorganizationmanagementapp.repositories.EmployeesRepository;
import com.cg.Aorganizationmanagementapp.services.EmployeesService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmployeesServiceImpl implements EmployeesService {

	private EmployeesRepository empRepository;

	@Override
	public void addEmployee(EmployeesDto empDto) {
		Employees employees = EmployeesMapper.mapToEmployees(empDto, new Employees());
		empRepository.save(employees);

	}

	public Departments getDepartmentByEmployeeId(Long employeeId) {
		return empRepository.findDepartmentByEmployeeId(employeeId);
	}


}
