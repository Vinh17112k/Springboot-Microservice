package com.techasians.department.service.serviceImpl;

import com.techasians.department.entity.Department;
import com.techasians.department.repository.DepartmentRepository;
import com.techasians.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department findByDepartmentId(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
