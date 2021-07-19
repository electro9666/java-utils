package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

public class ArrayUtilsTest {

	@Test
	public void test1() {
		String[] array = { "a", "b", "c" };
		assertThat(ArrayUtils.toString(array)).isEqualTo("{a,b,c}");
		assertThat(ArrayUtils.toString(null, "Array is null")).isEqualTo("Array is null");
		String[] array2 = { "a", "b", "c" };
		assertThat(ArrayUtils.hashCode(array2)).isEqualTo(997619);

		String[][] array3 = { { "1", "one", }, { "2", "two", }, { "3", "three" } };
		Map<String, String> map = new HashMap<>();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		Map<Object, Object> map2 = ArrayUtils.toMap(array3);
		assertThat(map2).isEqualTo(map);

		int[] array11 = { 1, 2, 3 };
		int[] array12 = { 1, 2, 3 };
		assertThat(ArrayUtils.isSameLength(array11, array12)).isTrue();

		int[] array13 = { 1, 2, 3, 4 };
		assertThat(ArrayUtils.indexOf(array13, 3, 0)).isEqualTo(2); // 주어진 요소의 인덱스 찾기
	}
}
