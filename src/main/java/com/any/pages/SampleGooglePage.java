package com.any.pages;

import org.springframework.beans.factory.annotation.Value;

import com.mgiorda.annotation.By;
import com.mgiorda.annotation.Locate;
import com.mgiorda.annotation.PageProperties;
import com.mgiorda.annotation.PageURL;
import com.mgiorda.test.AbstractPage;

@PageProperties("page-properties/page.properties")
@PageURL("${dev.host}/")
public class SampleGooglePage extends AbstractPage {

	@Locate(@By(name = "${locator.searchBox.name}"))
	private PageElement searchBox;

	@Locate(@By(id = "hplogo"))
	private GoogleDoodle doodle;

	@Locate(@By(id = "fbar"))
	private FooterBar footer;

	@Value("${page.someProperty}")
	private String someProperty;

	public void search(String text) {

		logger.info("logging host: " + someProperty);
		searchBox.sendKeys(text);
	}

	public SubPageStub goToSubPage() {
		return new SubPageStub(this);
	}

	public void clickOnDoodle() {
		doodle.click();
	}
}
