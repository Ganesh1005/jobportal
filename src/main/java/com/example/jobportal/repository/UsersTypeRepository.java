package com.example.jobportal.repository;


import com.example.jobportal.entity.UsersType;
import org.hibernate.usertype.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTypeRepository extends JpaRepository<UsersType,Integer> {

}
