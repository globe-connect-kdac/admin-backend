package com.blogs.services;
import com.blogs.dto.*;
import com.blogs.pojo.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.dao.AdminDao;
import com.blogs.pojo.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private AdminDao userDao;
	@Override
	public ApiResponse addNewUser(AddAdminDto userdto) {
		Admin user=mapper.map(userdto, Admin.class);
		System.out.println(user);
		Admin u=userDao.save(user);
		return new ApiResponse("Admin is Added with user Id "+u.getId(),"success");
	}
	
	

}
