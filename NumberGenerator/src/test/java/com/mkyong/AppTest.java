package com.mkyong;

import org.junit.Assert;
import org.junit.Test;

import com.test.App;

public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
}