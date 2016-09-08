/**
 * 
 */
package com.youku.yklive.springboot.controller;

import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 使用freemarker
 * @author liuquan
 *
 */
@Controller
@EnableAutoConfiguration
public class FreemarkerController {
	
	@RequestMapping("/marker")
	public String marker(Map<String,Object> model){
		model.put("value", "hellotest!");
		return "test";
	}

}
