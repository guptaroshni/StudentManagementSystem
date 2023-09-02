package com.masai.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.masai.Model.StudentAddress;
import com.masai.Repo.StudentAddressRepository;

@Service
@Transactional
public class StudentAddressService {

    private final StudentAddressRepository studentAddressRepository;

    @Autowired
    public StudentAddressService(StudentAddressRepository studentAddressRepository) {
        this.studentAddressRepository = studentAddressRepository;
    }

    public void addStudentAddress(StudentAddress studentAddress) {
        studentAddressRepository.save(studentAddress);
    }
}
