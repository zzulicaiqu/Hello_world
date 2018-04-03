package com.zzuli.cloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzuli.cloud.entity.User;
import com.zzuli.cloud.repository.UserRepository;

/**
 * 
 * @author 蔡渠
 * @date 2018年4月1日
 * @time 下午1:52:10
 * @title UserController.java
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRespository;
	
	@RequestMapping("/simple/{id}")
	public User findById(@PathVariable Long id) {
		return this.userRespository.findOne(id);
	}
}
