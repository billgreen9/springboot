package com.youku.yklive.springboot;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

//@Component
public class MyErrorViewResolver implements ErrorViewResolver {
	private static Logger log = LoggerFactory.getLogger(MyErrorViewResolver.class);
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request,
            HttpStatus status, Map<String, Object> model) {
        // Use the request or status to optionally return a ModelAndView
    	log.error("status:"+status.getReasonPhrase());
    	for(String key:model.keySet()){
    		log.error("key:"+key);
    	}
        return new ModelAndView("error");
    }
    
     

}
