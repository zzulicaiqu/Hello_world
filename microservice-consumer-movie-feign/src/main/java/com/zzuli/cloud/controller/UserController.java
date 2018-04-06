package com.zzuli.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zzuli.cloud.entiry.User;
import com.zzuli.cloud.feign.UserFeign;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

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
	
	@ApiOperation(value="根据id获取对象", notes="根据传入的参数id 获取User对象的信息")
	@ApiImplicitParam(name = "id",value = "用户id", required = true,dataType = "Long", paramType = "path")
	@GetMapping("/movie/{id}")
	public User getMovie(@PathVariable Long id){
		return userFeign.findById(id);
	}
}
