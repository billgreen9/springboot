/**
 * 
 */
package com.youku.yklive.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liuquan
 *
 */
@ConfigurationProperties(prefix ="app",locations={"classpath:app.properties"}) 
public class Configure {
	
	private int count;
	
	private String name;

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
