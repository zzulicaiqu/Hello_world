package com.zzuli.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zzuli.cloud.entity.User;

/**
 * 
 * @author 蔡渠
 * @date 2018年4月1日
 * @time 下午1:48:06
 * @title UserRepository.java
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
