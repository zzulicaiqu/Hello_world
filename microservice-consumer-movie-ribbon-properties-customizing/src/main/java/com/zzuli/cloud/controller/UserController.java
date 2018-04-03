package com.zzuli.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author caiqu
 *
 */
@RestController
public class UserController {

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@GetMapping("/test")
	public String test() {
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider-user");
		System.out.println("111" + ":" + serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":"
				+ serviceInstance.getPort());

		ServiceInstance serviceInstance2 = this.loadBalancerClient.choose("microservice-provider-user1");
		System.out.println("222" + ":" + serviceInstance2.getServiceId() + ":" + serviceInstance2.getHost() + ":"
				+ serviceInstance2.getPort());

		return "1";
	}
}
