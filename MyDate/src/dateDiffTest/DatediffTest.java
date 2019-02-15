package dateDiffTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import date_diff.MyDate;
class DatediffTest {
	

	@Test
	public void test1() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(06, 04, 2011);
		assertEquals(0, startDate.daysDifference(endDate));

	}

	@Test
	public void test2() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 04, 2011);
		assertEquals(12, startDate.daysDifference(endDate));

	}

	@Test
	public void test3() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 05, 2011);
		assertEquals(42, startDate.daysDifference(endDate));

	}

	@Test
	public void test4() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 06, 2011);
		assertEquals(73, startDate.daysDifference(endDate));

	}

	@Test
	public void test5() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2011);
		assertEquals(256, startDate.daysDifference(endDate));

	}

	@Test
	public void test6() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2012);
		assertEquals(622, startDate.daysDifference(endDate));

	}

	@Test
	public void test7() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2013);
		assertEquals(987, startDate.daysDifference(endDate));

	}
	@Test
	public void test8() {
		MyDate startDate = new MyDate(06,04,2011);
		MyDate endDate = new MyDate(18,12,2113);
		assertEquals(37511, startDate.daysDifference(endDate));

	}

	@Test
	public void test9() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2413);
		assertEquals(147084, startDate.daysDifference(endDate));

	}

	@Test
	public void test10() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2813);
		assertEquals(293181, startDate.daysDifference(endDate));

	}

	@Test
	public void test11() {
		MyDate startDate = new MyDate(06, 01, 2011);
		MyDate endDate = new MyDate(06, 03, 2011);
		assertEquals(59, startDate.daysDifference(endDate));

	}

	@Test
	public void test12() {
		MyDate startDate = new MyDate(06, 01, 2012);
		MyDate endDate = new MyDate(06, 03, 2012);
		assertEquals(60, startDate.daysDifference(endDate));

	}

	@Test
	public void test13() {
		MyDate startDate = new MyDate(06, 02, 2011);
		MyDate endDate = new MyDate(06, 03, 2012);
		assertEquals(29, startDate.daysDifference(endDate));

	}

	@Test
	public void test14() {
		MyDate startDate = new MyDate(22, 01, 2012);
		MyDate endDate = new MyDate(15, 11, 2012);
		assertEquals(298, startDate.daysDifference(endDate));

	}
	@Test
	public void test15() {
		MyDate startDate = new MyDate(06, 02, 2012);
		MyDate endDate = new MyDate(06, 12, 2012);
		assertEquals(304, startDate.daysDifference(endDate));

	}
}
