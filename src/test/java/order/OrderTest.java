package order;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {
	@Test
	public void test1() {
		assertEquals("Thi1s is2 3a T4est", Order.order("is2 Thi1s T4est 3a"));
	}

	@Test
	public void test2() {
		assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", Order.order("4of Fo1r pe6ople g3ood th5e the2"));
	}

	@Test
	public void test3() {
		assertEquals("wha1t sh2all 3we d4o w5ith a6 dru7nken s8ailor", Order.order("d4o dru7nken sh2all w5ith s8ailor wha1t 3we a6"));
	}

	@Test
	public void test4() {
		assertEquals("", Order.order(""));
	}

	@Test
	public void test5() {
		assertEquals("1 2 3 4 5 6 7 8 9", Order.order("3 6 4 2 8 7 5 1 9"));
	}

	@Test
	public void test6() {
		assertEquals("is2 3a T4est This", Order.order("is2 This T4est 3a"));
	}
}
