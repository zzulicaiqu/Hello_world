package com.zzuli.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zzuli.cloud.entiry.User;
import com.zzuli.cloud.feign.UserFeign;

/**
 * 
 * @author 蔡渠
 * @date 2018年4月1日
 * @time 下午2:10:56
 * @title UserController.java
 */
@RestController
public class UserController {

	@Autowired
	private UserFeign userFeign;
	
	@GetMapping("/movie/{id}")
	public User getMovie(@PathVariable Long id){
		return userFeign.findById(id);
	}
}
