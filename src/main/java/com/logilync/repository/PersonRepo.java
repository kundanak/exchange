package com.logilync.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logilync.domain.Person;

public interface PersonRepo extends JpaRepository<Person,Serializable> {

}
