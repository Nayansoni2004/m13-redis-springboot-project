package com.isrdc.entities;

import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "statehash", timeToLive = 600)
public class State {
	private Integer id;
	private String state;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
