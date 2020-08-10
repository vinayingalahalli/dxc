package com.demo;

import org.apache.log4j.Logger;

public class Log4jMain {

	private static Logger log=Logger.getLogger(Log4jMain.class);
	
	public static void main(String[] args) {
	
		log.trace("Hello from TRACE");
		log.debug("HELLO from DEBUG");
		log.info("HELLO  from INFO");
		log.warn("Hello from WARN");
		log.error("Hello from ERROR");
		log.fatal("HELLO from FATAL");

	}

}
