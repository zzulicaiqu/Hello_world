package com.zzuli.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author caiqu
 *
 */
@RestController
public class UserController {

	@Value("${content}")
    private String content;
	
	@RequestMapping("/")
	public String getKey() {
		return "content:"+ content;
	}
}
