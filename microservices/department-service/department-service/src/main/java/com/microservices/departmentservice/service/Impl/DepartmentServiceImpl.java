package com.microservices.departmentservice.service.Impl;

import org.springframework.stereotype.Service;

import com.microservices.departmentservice.dto.DepartmentDto;
import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.repository.DepartmentRepository;
import com.microservices.departmentservice.service.DepartmentService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        // convert department dto to department jpa entity
        Department department = new Department(
        		departmentDto.getID(),
        		departmentDto.getDepartmentName(),
        		departmentDto.getDepartmentDescription(),
        		departmentDto.getDepartmentCode()
    );
    
    Department savedDepartment = departmentRepository.save(department);
    
    DepartmentDto savedDepartmentDto = new DepartmentDto(
    		savedDepartment.getID(),
    		savedDepartment.getDepartmentName(),
    		savedDepartment.getDepartmentDescription(),
    		savedDepartment.getDepartmentCode()
    		);
    
    return savedDepartmentDto;
        		
        		
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto = new DepartmentDto(
        		department.getID(),
        		department.getDepartmentName(),
        		department.getDepartmentDescription(),
        		department.getDepartmentCode()
        		);
        		

        return departmentDto;
    }

}
