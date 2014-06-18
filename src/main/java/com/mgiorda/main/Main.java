package com.mgiorda.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.mgiorda.test.TestPoolRunner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		final String defaultTestContext = "suite-context.xml";
		ApplicationContext mainApplicationContext = new GenericXmlApplicationContext(defaultTestContext);

		TestPoolRunner testRunner = mainApplicationContext.getBean(TestPoolRunner.class);

		testRunner.run();
	}
}
