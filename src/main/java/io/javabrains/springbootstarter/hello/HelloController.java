package io.javabrains.springbootstarter.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger( HelloController.class );
	
	
	@Autowired
	Environment environment;
	
	@RequestMapping("/hello")
	public String sayHi() throws Exception {
		logger.trace("HelloController : trace : sayHi()");
		logger.debug("HelloController : debug : sayHi()");
		logger.info("HelloController : info : sayHi()");
		logger.warn("HelloController : warn : sayHi()");
		logger.error("HelloController : error : sayHi()");		
		//logUtil.logMessage("Hello testing", "INFO");
		String s[] = environment.getActiveProfiles();
		System.out.println("dsfsdf : " + environment.getActiveProfiles().length);
		for (int i = 0; i < s.length; i++) {
			System.out.println("hello how r u : " + s[i]);
		}
		System.out.println("hello how r u1 : " + environment.getActiveProfiles());
		//throw new Exception("some issue");
		return "Hi";
	}

}
