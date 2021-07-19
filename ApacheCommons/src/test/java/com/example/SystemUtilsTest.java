package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;

import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

/**
 * 분수
 *
 */
public class SystemUtilsTest {
	@Test
	public void whenCalledgetJavaHome_thenCorrect() {
		assertThat(SystemUtils.getJavaHome()).isEqualTo(new File("path/to/java/jdk"));
	}

	@Test
	public void whenCalledgetUserHome_thenCorrect() {
		assertThat(SystemUtils.getUserHome()).isEqualTo(new File("path/to/user/home"));
	}

	@Test
	public void whenCalledisJavaVersionAtLeast_thenCorrect() {
		assertThat(SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_RECENT)).isTrue();
	}
}
