package com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {

}
