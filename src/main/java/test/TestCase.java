package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import uk.ac.suffolk.i2j.refactoring.Asdfghjk;

public class TestCase {
	@Test
	public void testNone() {
		Asdfghjk a = new Asdfghjk();
		assertEquals(0, a.howMany());
	}

	@Test
	public void testOne() {
		Asdfghjk a = new Asdfghjk(1);
		assertEquals(1, a.howMany());
	}

	@Test
	public void testTwo() {
		Asdfghjk a = new Asdfghjk(2);
		assertEquals(2, a.howMany());
	}

	@Test
	public void testThree() {
		Asdfghjk a = new Asdfghjk(3);
		assertEquals(3, a.howMany());
	}

	@Test
	public void testMore() {
		Asdfghjk a = new Asdfghjk(7);
		assertEquals(99, a.howMany());
	}

	@Test
	public void testNextOne() {
		Asdfghjk a = new Asdfghjk(1);
		a.next();
		assertEquals(2, a.howMany());
	}

	@Test
	public void testNextTwo() {
		Asdfghjk a = new Asdfghjk(2);
		a.next();
		assertEquals(3, a.howMany());
	}

	@Test
	public void testNextThree() {
		Asdfghjk a = new Asdfghjk(3);
		a.next();
		assertEquals(99, a.howMany());
	}

	@Test
	public void testNextMore() {
		Asdfghjk a = new Asdfghjk(7);
		a.next();
		assertEquals(99, a.howMany());
	}
}
