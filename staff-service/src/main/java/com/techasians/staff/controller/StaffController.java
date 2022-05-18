package com.techasians.staff.controller;

import com.techasians.staff.entity.Staff;
import com.techasians.staff.service.StaffService;
import com.techasians.staff.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class StaffController {
    @Autowired
    private StaffService staffService;
    @PostMapping("/create")
    public Staff saveStaff(@RequestBody Staff staff){
        return staffService.saveStaff(staff);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
//        log.info("Inside getUserWithDepartment of UserController");
        return staffService.getUserWithDepartment(userId);
    }
}
