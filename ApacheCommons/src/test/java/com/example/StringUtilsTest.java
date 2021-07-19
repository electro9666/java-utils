package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsTest {
	@Test
	public void test1() {
		assertThat(StringUtils.isBlank(" ")).isTrue();
		assertThat(StringUtils.isEmpty("")).isTrue();
		assertThat(StringUtils.isAllLowerCase("abd")).isTrue();
		assertThat(StringUtils.isAllUpperCase("ABC")).isTrue();
		assertThat(StringUtils.isMixedCase("abC")).isTrue();
		assertThat(StringUtils.isAlpha("abc")).isTrue();
		assertThat(StringUtils.isAlphanumeric("abc123")).isTrue();
	}
}
