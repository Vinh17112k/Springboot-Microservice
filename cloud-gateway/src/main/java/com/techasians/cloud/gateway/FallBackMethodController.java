package com.techasians.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
  @GetMapping("staffFallBack")
  public String staffServiceFallBackMethod(){
    return "staff service long to response";
  }
  @GetMapping("departmentFallBack")
  public String departmentFallBackMethoid(){
    return "department service long to response";
  }
}
