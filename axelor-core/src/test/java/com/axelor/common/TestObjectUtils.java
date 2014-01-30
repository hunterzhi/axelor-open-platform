package com.axelor.common;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class TestObjectUtils {

	@Test
	public void testIsEmpty() {
		Assert.assertTrue(ObjectUtils.isEmpty(null));
		Assert.assertTrue(ObjectUtils.isEmpty(""));
		Assert.assertFalse(ObjectUtils.isEmpty(" "));
		Assert.assertTrue(ObjectUtils.isEmpty(Maps.newHashMap()));
		Assert.assertFalse(ObjectUtils.isEmpty(ImmutableMap.of("some", "value")));
		Assert.assertTrue(ObjectUtils.isEmpty(Lists.newArrayList()));
		Assert.assertFalse(ObjectUtils.isEmpty(Lists.newArrayList("some", "value")));
	}
}
