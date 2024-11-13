package com.cg.Aorganizationmanagementapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.Aorganizationmanagementapp.entities.Departments;
import com.cg.Aorganizationmanagementapp.entities.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {

	@Query("SELECT d FROM Departments d, Employees e WHERE e.employeeId = :employeeId AND e.departmentId = d.departmentId")
	Departments findDepartmentByEmployeeId(Long employeeId);



}
