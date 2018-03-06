package org.dubbo.provider.test;

import com.yusx.remote.api.TestService;

public class TestServiceImpl implements TestService{

	@Override
	public String getOutMsg(String name) {
		// TODO Auto-generated method stub
		return name + "：1992-10-14";
	}

}
