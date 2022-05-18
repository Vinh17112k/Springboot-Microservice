package com.techasians.staff.service;

import com.techasians.staff.entity.Staff;
import com.techasians.staff.vo.ResponseTemplateVO;

public interface StaffService {
    Staff saveStaff(Staff staff);
    Staff findByStaffId(Long staffId);
    ResponseTemplateVO getUserWithDepartment(Long userId);
}
