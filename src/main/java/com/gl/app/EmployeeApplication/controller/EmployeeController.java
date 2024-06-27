package com.gl.app.EmployeeApplication.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public ResponseEntity<String> getDetails(){
        System.out.println("Employee Details in feature1 branch");
        return new ResponseEntity<>("Employee Details", HttpStatus.OK);
    }
}
