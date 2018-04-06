package com.zzuli.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zzuli.cloud.entity.User;

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
	private RestTemplate restTemplate;
	
	@Value("${user.consumerPath}")
	private String consumerPath;
	
	@GetMapping("/movie/{id}")
	public User getMovie(@PathVariable Long id){
		return this.restTemplate.getForObject("http://microservice-provider-user/simple/" + id, User.class);
	}
}
