package com.microservices.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private EmployeeDto employee;
    private DepartmentDto department;
    //private OrganizationDto organization;
	public void setEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		
	}
	public void setDepartment(DepartmentDto departmentDto) {
		// TODO Auto-generated method stub
		
	}


}
