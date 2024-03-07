package com.SpringBootJDataJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJDataJPA.model.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer> {

}
