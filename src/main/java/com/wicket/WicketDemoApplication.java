package com.wicket;

import com.wicket.helloworld.HelloWorld;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;


public class WicketDemoApplication extends WebApplication {
	@Override
	public Class<? extends Page> getHomePage() {
		return HelloWorld.class;
	}
}