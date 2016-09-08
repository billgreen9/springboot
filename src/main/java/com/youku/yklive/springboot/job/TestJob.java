/**
 * 
 */
package com.youku.yklive.springboot.job;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author liuquan
 *
 */
@Component
public class TestJob {
	
	@Value("${username}")
	private String userName;
	//@Value("${app.description}")
	private String msg;
	
	@Scheduled(cron = "*/5 * * * * ?")
	public void execute(){
		System.out.println("hello!"+userName+",msg="+msg);
	}

}
