package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Admin;
import com.project.repository.AdminRepopsitory;

@Service
public class AdminService {
	@Autowired
	private AdminRepopsitory arepo;
	public void save(Admin a) {
		arepo.save(a);
	}
	public List<Admin> fetchAll() {
		return arepo.findAll();
	}

}
