package com.microservices.employeeservice.service.Impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.employeeservice.dto.APIResponseDto;
import com.microservices.employeeservice.dto.DepartmentDto;
import com.microservices.employeeservice.dto.EmployeeDto;
import com.microservices.employeeservice.entity.Employee;
import com.microservices.employeeservice.repository.EmployeeRepository;
import com.microservices.employeeservice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
		
		public EmployeeRepository employeeRepositoy;
		
		private RestTemplate restTemplate;
		// TODO Auto-generated method stub
		@Override
		public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
			
			Employee employee = new Employee(
					employeeDto.getId(),
					employeeDto.getFirstName(),
					employeeDto.getLastName(),
					employeeDto.getEmail()
					);
			
			Employee savedEmployee = employeeRepositoy.save(employee);
			
			EmployeeDto savedEmployeeDto = new EmployeeDto(
					savedEmployee.getId(),
					savedEmployee.getFirstName(),
					savedEmployee.getLastName(),
					savedEmployee.getEmail(),
					savedEmployee.getDepartmentCode()
					);
		
		return savedEmployeeDto;
	}
		@Override
		public APIResponseDto getEmployeeById(Long employeeId) {
			
			Employee employee = employeeRepositoy.findById(employee.Id).get();
			
			ResponseEntity<DepartmentDto> responseEntity = restTemplate.getForEntity("http://DEPARTMENT-SERVICE/api/departments/" + employee.getDepartmentCode(),
                DepartmentDto.class);
	
        DepartmentDto departmentDto = responseEntity.getBody();
			
			EmployeeDto employeeDto = new EmployeeDto(
					employee.getId(),
					employee.getFirstName(),
					employee.getLastName(),
					employee.getEmail(),
					employee.getDepartmentCode()
					);
			APIResponseDto  apiResponseDto = new APIResponseDto();
			apiResponseDto.setEmployee(employeeDto);
			apiResponseDto.setDepartment(departmentDto);
			// TODO Auto-generated method stub
			return apiResponseDto;
		}

}
