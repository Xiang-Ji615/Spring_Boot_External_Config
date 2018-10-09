package main.java.spring.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="Rest/V1")
public class RestfulController {

	@Value("${jj.value}")
	String jjValue;
	
	@RequestMapping(value="HelloWorld", method= RequestMethod.GET)
	public Object helloWorld() {
		return jjValue + "Hello world";
	}
}
