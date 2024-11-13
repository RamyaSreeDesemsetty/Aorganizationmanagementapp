package com.cg.Aorganizationmanagementapp.mapper;

import com.cg.Aorganizationmanagementapp.dto.DepartmentsDto;
import com.cg.Aorganizationmanagementapp.entities.Departments;

public class DepartmentsMapper {


		public static Departments mapToDepartment(DepartmentsDto departmentDto, Departments departments) {
			departments.setDepartmentId(departmentDto.getDepartmentId());
			departments.setDepartmentName(departmentDto.getDepartmentName());
			return departments;
		}

		public static DepartmentsDto mapToDepartmentDto(Departments departments, DepartmentsDto departmentDto) {
			departmentDto.setDepartmentId(departments.getDepartmentId());
			departmentDto.setDepartmentName(departments.getDepartmentName());
			return departmentDto;
		}
	}

