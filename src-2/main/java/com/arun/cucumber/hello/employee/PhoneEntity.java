package com.arun.cucumber.hello.employee;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "phone")
@Getter
@Setter
@EqualsAndHashCode
public class PhoneEntity implements Serializable {

  @Id
  private Long id;

  private String type;
  private String isdCode;
  private String phoneNumber;
  private String extension;

}
