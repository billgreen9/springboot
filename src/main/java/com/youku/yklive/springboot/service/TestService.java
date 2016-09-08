package com.youku.yklive.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public  class TestService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional
	public void getUser(){
		
	}
	
	@Transactional
	public void add(String name){
		String sql ="insert into test(name) values('zhagnsan')";
		jdbcTemplate.update(sql);
		String sql1 ="insert into test(name) values(?)";
		if(name!=null){
			jdbcTemplate.update(sql1,name);
		}
		if("1".equals(name)){
			throw new RuntimeException();
		}
	}

}
