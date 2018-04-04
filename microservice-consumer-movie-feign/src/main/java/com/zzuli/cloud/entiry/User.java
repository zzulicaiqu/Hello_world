package com.zzuli.cloud.entiry;

import java.math.BigDecimal;

/**
 * 
 * @author 蔡渠
 * @date 2018年4月1日
 * @time 下午2:07:20
 * @title User.java
 */

public class User {
	  private Long id;

	  private String username;

	  private String name;

	  private Short age;

	  private BigDecimal balance;

	  public Long getId() {
	    return this.id;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }

	  public String getUsername() {
	    return this.username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }

	  public String getName() {
	    return this.name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public Short getAge() {
	    return this.age;
	  }

	  public void setAge(Short age) {
	    this.age = age;
	  }

	  public BigDecimal getBalance() {
	    return this.balance;
	  }

	  public void setBalance(BigDecimal balance) {
	    this.balance = balance;
	  }

}
