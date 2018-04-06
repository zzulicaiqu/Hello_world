package com.zzuli.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zzuli.cloud.entity.User;

@RestController
public class UserController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "findByIdFallback") //声明在熔断发生时应该操作的fallBack方法名称
	public User findById(@PathVariable("id") Long id){
		return this.restTemplate.getForObject("http://microservice-provider-user/simple/" + id, User.class);
	}
	
	//函数定义
	public User findByIdFallback(Long id){
		User user = new User();
		user.setId(0L);
		System.out.println("sss1111111111111111");
		return user;
	}
}
