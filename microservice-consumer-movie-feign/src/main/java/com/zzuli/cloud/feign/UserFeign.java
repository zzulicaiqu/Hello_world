package com.zzuli.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zzuli.cloud.entiry.User;

/**
 * 
 * @author caiqu
 *
 */
@FeignClient("microservice-provider-user")
public interface UserFeign {

	@RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable("id") Long id);
}
