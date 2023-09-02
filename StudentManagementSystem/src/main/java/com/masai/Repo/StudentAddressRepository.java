package com.masai.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.StudentAddress;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress, Long> {
}

