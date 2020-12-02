package com.webservice.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorldInterface {
	
	
	@WebMethod public String helloWorld(String name);

}
