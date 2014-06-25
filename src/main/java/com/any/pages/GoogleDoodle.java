package com.any.pages;

import com.mgiorda.annotation.By;
import com.mgiorda.annotation.Locate;
import com.mgiorda.test.AbstractElement;

class GoogleDoodle extends AbstractElement {

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