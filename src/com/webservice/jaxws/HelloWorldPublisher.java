package com.webservice.jaxws;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String args[])
	{
		Endpoint.publish("http://localhost:8080/WS/HelloWorld", new HelloWorldImpl());
	}
}
