package com.any.tests;

import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.Test;

import com.any.pages.SampleGooglePage;
import com.mgiorda.annotations.TestProperties;
import com.mgiorda.test.AbstractTest;

@TestProperties("test-properties/${suite.env:dev}-test.properties")
public class StubTest extends AbstractTest {

	@Value("${${suite.env:dev}.host}")
	private String host;

	@Test(invocationCount = 3, threadPoolSize = 2)
	public void test() {

		SampleGooglePage page = new SampleGooglePage();

		logger.info("Created Google page");

		page.search(host);
		page.clickOnDoodle();

		PageAssert.assertTitle(page, "Google");
	}
}
