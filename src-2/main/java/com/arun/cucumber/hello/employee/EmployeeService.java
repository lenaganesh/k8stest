package com.arun.cucumber.hello.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

@Service
@Validated
public class EmployeeService {

  @Autowired
  private EmployeeMapper mapper;

  @Autowired
  private EmployeeDao employeeDao;

  @Transactional
  @Validated
  public Long create(@Valid Employee employee) {
    EmployeeEntity employeeEntity = mapper.toEmployeeEntity(employee);
    employeeDao.save(employeeEntity);

    return employeeEntity.getId();
  }

}
