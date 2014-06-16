package com.mgiorda.main;

import com.mgiorda.page.Browser;
import com.mgiorda.test.SuiteConfiguration;
import com.mgiorda.test.TestSuiteRunner;

public class Main {

	public static void main(String[] args) {

		SuiteConfiguration suiteConfiguration = new SuiteConfiguration("suite.xml", Browser.CHROME);
		new TestSuiteRunner(suiteConfiguration).run();
	}
}
