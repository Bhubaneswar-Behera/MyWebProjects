package com.wallmart.security;

import org.springframework.stereotype.Service;

/** 
 * Note : 
 * Its not a base package.
 * Base Package is : in.ashokit
 * Sub package is : in.ashokit.service, in.ashokit.dao etc etc
 * But com.wallmart.security is not a part of base package of by default object 
 * will not be created.
 * 
 * @author Bhubaneswar Behera
 *
 */
@Service
public class PassswordUtils {
	public PassswordUtils() {
		System.out.println("PassswordUtils :: Constructor");
		
	}

}
