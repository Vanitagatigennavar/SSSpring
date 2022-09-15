package com.xworkz.book.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConnectionConfi {
	@Value("${url}")
	public String url;
	@Value("${user}")
	public String userName;
	@Value("${pwd}")
	public String password;
	public ConnectionConfi(String url, String userName, String password) {
		
		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "ConnectionConfi [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
	
	

}
