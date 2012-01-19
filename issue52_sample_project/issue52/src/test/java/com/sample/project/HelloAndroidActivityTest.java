package com.sample.project;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {

	@Test
	public void onCreateUpdatesSomeBoolean() {
		HelloAndroidActivity activity = new HelloAndroidActivity();
		Assert.assertFalse(activity.someBoolean);
		activity.onCreate(null);
		Assert.assertTrue(activity.someBoolean);
	}

}
