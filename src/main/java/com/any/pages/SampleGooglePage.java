package com.any.pages;

import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;

import com.mgiorda.pagetest.AbstractPage;
import com.mgiorda.test.PageProperties;

@PageProperties("page.properties")
public class SampleGooglePage extends AbstractPage {

	@FindBy(name = "q")
	private PageElement searchBox;

	@Value("${page.someProperty}")
	private String someProperty;

	public SampleGooglePage() {
		super("http://www.google.com");
	}

	public void search(String text) {
		logger.info("logging host: " + someProperty);
		searchBox.sendKeys(text);
	}

	public SubPageStub goToSubPage() {
		return new SubPageStub(this);
	}
}
