package com.techasians.staff.service.serviceImpl;

import com.techasians.staff.entity.Staff;
import com.techasians.staff.repository.StaffRepository;
import com.techasians.staff.service.StaffService;
import com.techasians.staff.vo.Department;
import com.techasians.staff.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Staff saveStaff(Staff staff){
        staffRepository.save(staff);
        return staffRepository.save(staff);
    }
    @Override
    public Staff findByStaffId(Long id){
        return staffRepository.findByStaffId(id);
    }
    @Override
    public ResponseTemplateVO getUserWithDepartment(Long userId) {
//        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Staff staff = staffRepository.findByStaffId(userId);

        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + staff.getDepartmentId()
                        ,Department.class);

        vo.setStaff(staff);
        vo.setDepartment(department);

        return  vo;
    }
}
