package com.arun.cucumber.hello.employee;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


import org.springframework.data.annotation.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
@EqualsAndHashCode
public class EmployeeEntity implements Serializable {

  @Id
  private Long id;

  private String firstName;
  private String lastName;

  public LocalDate dateOfBirth;
  public LocalDate startDate;
  public LocalDate endDate;
  private String employmentType;

  private String email;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "employee_id", referencedColumnName = "id")
  private List<PhoneEntity> phones;
}
