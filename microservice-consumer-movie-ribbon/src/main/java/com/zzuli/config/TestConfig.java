package com.zzuli.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 
 * @author caiqu
 *
 */
@Configuration
public class TestConfig {

	@Bean
	  public IRule ribbonRule() {
	    return new RandomRule();
	  }
}
