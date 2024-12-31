package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Admin;
@Repository
public interface AdminRepopsitory  extends JpaRepository<Admin, Integer>{

}
