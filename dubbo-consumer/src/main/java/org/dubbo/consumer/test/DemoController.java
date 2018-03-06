package org.dubbo.consumer.test;

import org.dubbo.api.test.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yusx.remote.api.TestService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="show",method=RequestMethod.GET)
	public HelloTest getRemote(){
		//String sayHello = demoService.getRemoteMsg("yushengxian");
		String outMsg = testService.getOutMsg("yushengxian");
		HelloTest helloTest = new HelloTest();
		helloTest.setMsg(outMsg);
		return helloTest;
	}
}
