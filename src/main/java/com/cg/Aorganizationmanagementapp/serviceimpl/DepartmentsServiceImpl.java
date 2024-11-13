package com.cg.Aorganizationmanagementapp.serviceimpl;

import org.springframework.stereotype.Service;

import com.cg.Aorganizationmanagementapp.dto.DepartmentsDto;
import com.cg.Aorganizationmanagementapp.entities.Departments;
import com.cg.Aorganizationmanagementapp.mapper.DepartmentsMapper;
import com.cg.Aorganizationmanagementapp.repositories.DepartmentsRepository;
import com.cg.Aorganizationmanagementapp.services.DepartmentsService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentsServiceImpl implements DepartmentsService {

	private DepartmentsRepository departmentReporisoty;

	@Override
	public void addDepartment(DepartmentsDto departmentDto) {
		Departments departments = DepartmentsMapper.mapToDepartment(departmentDto, new Departments());
		departmentReporisoty.save(departments);
	}

}
