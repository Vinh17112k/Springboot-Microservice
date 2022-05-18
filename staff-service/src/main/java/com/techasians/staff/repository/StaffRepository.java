package com.techasians.staff.repository;

import com.techasians.staff.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    Staff findByStaffId(Long staffId);
}
