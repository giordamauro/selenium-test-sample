package com.any.tests;

import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.Test;

import com.any.pages.SampleGooglePage;
import com.mgiorda.test.AbstractTest;
import com.mgiorda.test.TestProperties;

@TestProperties("properties/${suite.env:dev}-test.properties")
public class StubTest extends AbstractTest {

	@Value("${${suite.env:dev}.host}")
	private String host;

	@Test(invocationCount = 3, threadPoolSize = 2)
	public void test() {

		SampleGooglePage page = new SampleGooglePage();

		page.search(host);
	}

}
