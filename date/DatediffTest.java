package dateDiffTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import date_diff.MyDate;

public class DatediffTest {

	@Test
	public void test1() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(06, 04, 2011);
		assertEquals(1, startDate.daysDifference(endDate));

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

}
