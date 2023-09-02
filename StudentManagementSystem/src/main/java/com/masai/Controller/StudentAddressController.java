package com.masai.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.masai.Model.StudentAddress;
import com.masai.Service.StudentAddressService;

@RestController
@RequestMapping("/student-addresses")
public class StudentAddressController {

    private final StudentAddressService studentAddressService;

    @Autowired
    public StudentAddressController(StudentAddressService studentAddressService) {
        this.studentAddressService = studentAddressService;
    }

    @PostMapping("/")
    public void addStudentAddress(@RequestBody StudentAddress studentAddress) {
        studentAddressService.addStudentAddress(studentAddress);
    }
}

