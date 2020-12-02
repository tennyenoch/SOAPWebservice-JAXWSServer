package com.webservice.jaxws;

import javax.jws.WebService;

@WebService(endpointInterface="com.webservice.jaxws.HelloWorldInterface")
public class HelloWorldImpl implements HelloWorldInterface {

	@Override
	public String helloWorld(String name) {
		// TODO Auto-generated method stub
		return "Hello world :"+name;
	}

}
