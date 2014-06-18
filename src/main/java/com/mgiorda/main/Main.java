package com.mgiorda.main;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		final String defaultTestContext = "suite-context.xml";

		new GenericXmlApplicationContext(defaultTestContext);
	}
}
