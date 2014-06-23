package com.any.pages;

import com.mgiorda.annotations.By;
import com.mgiorda.annotations.Locate;
import com.mgiorda.test.AbstractElement;

public class GoogleDoodle extends AbstractElement {

	@Locate(@By(xpath = "./a"))
	private PageElement link;

	public GoogleDoodle(PageElement pageElement) {
		super(pageElement);
	}

	public void click() {

		if (link.isDisplayed()) {
			link.click();
		}
	}
}