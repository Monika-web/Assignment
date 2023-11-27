package com.microservices.departmentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
	
	private Long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;
	public DepartmentDto(Object id2, Object departmentName2, Object departmentDescription2, Object departmentCode2) {
		// TODO Auto-generated constructor stub
	}
	public Object getID() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDepartmentName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDepartmentDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDepartmentCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
