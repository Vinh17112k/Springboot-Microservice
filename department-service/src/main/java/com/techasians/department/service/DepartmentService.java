package com.techasians.department.service;

import com.techasians.department.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department findByDepartmentId(Long departmentId);
}
