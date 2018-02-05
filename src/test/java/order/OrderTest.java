package order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OrderTest {

	private String expected;
	private String input;

	public OrderTest(String expected, String input) {
		this.expected = expected;
		this.input = input;
	}

	@Parameterized.Parameters
	public static Collection parameters() {
		return Arrays.asList(new Object[][]{
				{"Thi1s is2 3a T4est", "is2 Thi1s T4est 3a"},
				{"Fo1r the2 g3ood 4of th5e pe6ople", "4of Fo1r pe6ople g3ood th5e the2"},
				{"wha1t sh2all 3we d4o w5ith a6 dru7nken s8ailor", "d4o dru7nken sh2all w5ith s8ailor wha1t 3we a6"},
				{"", " "},
				{"1 2 3 4 5 6 7 8 9", "3 6 4 2 8 7 5 1 9"},
				{"is2 3a T4est This", "is2 This T4est 3a"}
		});
	}

	@Test
	public void test1() {
		assertEquals(expected, Order.order(input));
		assertEquals(expected, Order2.order(input));
	}
}
