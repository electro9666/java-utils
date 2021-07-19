package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

public class NumberUtilsTest {
	@Test
	public void test1() {
		assertThat(NumberUtils.compare(1, 1)).isEqualTo(0);
		assertThat(NumberUtils.compare(1, 0)).isEqualTo(1);
		assertThat(NumberUtils.compare(0, 2)).isEqualTo(-1);
		assertThat(NumberUtils.compare(1L, 1L)).isEqualTo(0);

		Number createNumber = NumberUtils.createNumber("123456");
		assertThat(createNumber).isEqualTo(123456);

		assertThat(NumberUtils.isDigits("123456")).isTrue();

		int[] array = { 1, 2, 3, 4, 5, 6 };
		assertThat(NumberUtils.max(array)).isEqualTo(6);

		int[] array2 = { 1, 2, 3, 4, 5, 6 };
		assertThat(NumberUtils.min(array2)).isEqualTo(1);

		byte[] array3 = { 1, 2, 3, 4, 5, 6 };
		assertThat(NumberUtils.min(array3)).isEqualTo((byte) 1);
	}
}
