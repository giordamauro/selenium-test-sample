package com.mgiorda.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.mgiorda.test.TestRunner;

public class Main {

	private static final String DEFAULT_SUITE_CONTEXT = "suite-context.xml";

	public static void main(String[] args) {

		String suiteContext = DEFAULT_SUITE_CONTEXT;

		if (args != null && args.length == 1) {
			suiteContext = args[0];
		}

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new GenericXmlApplicationContext(suiteContext);

		TestRunner testRunner = applicationContext.getBean(TestRunner.class);

		testRunner.run();
	}
}
