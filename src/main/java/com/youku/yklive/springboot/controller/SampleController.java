package com.youku.yklive.springboot.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
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
