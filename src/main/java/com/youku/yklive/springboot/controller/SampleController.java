package com.youku.yklive.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.youku.yklive.springboot.service.TestService;

@Controller
@EnableAutoConfiguration
public class SampleController {
	
	@Autowired
	private TestService testService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    
    @RequestMapping("/add")
    @ResponseBody
   public  String add(String name) {
    	testService.add(name);
        return "add ok!";
    }
    
    
    

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SampleController.class, args);
// ///不能run两次在，只能run一次   	
////    	public static void main(String[] args) throws Exception {
////            SpringApplication.run(SampleController.class, args);
////            SpringApplication.run(TestController.class, args);
////        }
//    }
}
