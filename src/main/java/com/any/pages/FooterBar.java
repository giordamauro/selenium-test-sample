package com.any.pages;

import java.util.List;

import com.mgiorda.annotation.By;
import com.mgiorda.annotation.Locate;
import com.mgiorda.page.element.Link;
import com.mgiorda.test.AbstractElement;

public class FooterBar extends AbstractElement {

	@Locate(@By(xpath = "./div/span"))
	private List<Link> links;

	public FooterBar(PageElement pageElement) {
		super(pageElement);
	}

}
