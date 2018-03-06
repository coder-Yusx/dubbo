package org.dubbo.provider.test;

import org.dubbo.api.test.DemoService;

public class DemoServiceImpl implements DemoService{

	public String getRemoteMsg(String name) {
		// TODO Auto-generated method stub
		return "Hello, " + name + " (from Spring Boot)";
	}

}
