package com.blogs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.pojo.Admin;

public interface AdminDao extends JpaRepository <Admin,Long>{
	
	

}
