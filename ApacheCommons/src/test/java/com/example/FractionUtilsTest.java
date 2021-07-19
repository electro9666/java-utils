package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.lang3.math.Fraction;
import org.junit.Test;

/**
 * 분수
 *
 */
public class FractionUtilsTest {
	@Test
	public void test1() {
		assertThat(Fraction.getFraction(5, 6)).isInstanceOf(Fraction.class);

		Fraction fraction1 = Fraction.getFraction(1, 4);
		Fraction fraction2 = Fraction.getFraction(3, 4);
		assertThat(fraction1.add(fraction2).toString()).isEqualTo("1/1");

		Fraction fraction11 = Fraction.getFraction(3, 4);
		Fraction fraction12 = Fraction.getFraction(1, 4);
		assertThat(fraction11.subtract(fraction12).toString()).isEqualTo("1/2");

		Fraction fraction21 = Fraction.getFraction(3, 4);
		Fraction fraction22 = Fraction.getFraction(1, 4);
		assertThat(fraction21.multiplyBy(fraction22).toString()).isEqualTo("3/16");
	}
}
