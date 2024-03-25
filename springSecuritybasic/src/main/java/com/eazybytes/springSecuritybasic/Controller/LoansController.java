package com.eazybytes.springSecuritybasic.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

  @GetMapping("/myLoans")
  public String getLoansDetails(){
    return "Here are the loan details!";
  }

}
