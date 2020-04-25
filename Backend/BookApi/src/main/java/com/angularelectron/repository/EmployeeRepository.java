package com.angularelectron.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.angularelectron.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
}
