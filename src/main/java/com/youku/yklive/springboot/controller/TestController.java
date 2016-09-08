/**
 * 
 */
package com.youku.yklive.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuquan
 *
 */
@Controller
@EnableAutoConfiguration
public class TestController {
	
	private static Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return "test";
	}
	
/////不主张这么干，spring boot对jsp页面支持不太好,高版本页面就不能展示
	@RequestMapping("/hello")
	public String hello(){
		return "hello1";
	}
	
	/////不主张这么干，spring boot对jsp页面支持不太好,高版本页面就不能展示
	@RequestMapping("/hello1")
	public String hello1(){
		return "hello1";
	}
	
	@RequestMapping("/get_count")
	@ResponseBody
	public String getCount(){
		int count = jdbcTemplate.queryForObject("select count(1) from talk", Integer.class);
		log.info("fsfff=====count="+count+",get_count!!!!!");
		System.out.println("====ggg111==");
		return "db count="+count;
	}
}
