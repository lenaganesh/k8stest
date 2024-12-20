package com.arun.cucumber.hello.employee;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Phone {

  @NotNull
  private Long id;

  @NotEmpty
  private String type;

  @NotEmpty
  private String isdCode;

  @NotEmpty
  private String phoneNumber;

  private String extension;
}
