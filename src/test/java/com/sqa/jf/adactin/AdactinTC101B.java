/**
 * File Name: AdactinTC101B.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 1, 2017
 */
package com.sqa.jf.adactin;

import org.testng.annotations.*;

import com.sqa.jf.auto.*;

/**
 * AdactinTC101B //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class AdactinTC101B extends BasicTest {

	/**
	 * @param baseUrl
	 */
	public AdactinTC101B() {
		super("http://adactin.com/HotelApp");
		this.testingName = "Adactin PG ";
	}

	@Test
	public void loginTest() {
		AdactinHomePage homePage = new AdactinHomePage(this);
		this.takeScreenshot();
		homePage.login("sqabcjune12", "sqaadmin2017");
		this.takeScreenshot();
	}
}
