package uk.ac.suffolk.i2j.refactoring;

public class Asdfghjk {
	private boolean none;
	private boolean one;
	private boolean two;
	private boolean three;
	private boolean more;

	public Asdfghjk() {
		this.none = true;
		this.one = false;
		this.two = false;
		this.three = false;
		this.more = false;
	}

	public Asdfghjk(int value) {
		if (value == 0) {
			this.none = true;
			this.one = false;
			this.two = false;
			this.three = false;
			this.more = false;
		} else if (value == 1) {
			this.none = false;
			this.one = true;
			this.two = false;
			this.three = false;
			this.more = false;
		} else if (value == 2) {
			this.none = false;
			this.one = false;
			this.two = true;
			this.three = false;
			this.more = false;
		} else if (value == 3) {
			this.none = false;
			this.one = false;
			this.two = false;
			this.three = true;
			this.more = false;
		} else if (value > 3) {
			this.none = false;
			this.one = false;
			this.two = false;
			this.three = false;
			this.more = true;
		}
	}

	public int howMany() {
		if (none == true) {
			return 0;
		} else if (one == true) {
			return 1;
		} else if (two == true) {
			return 2;
		} else if (three == true) {
			return 3;
		} else if (more == true) {
			return 99;
		}
		return 99;
	}

	public void next() {
		if (none == true) {
			none = false;
			one = true;
		} else if (one == true) {
			one = false;
			two = true;
		} else if (two == true) {
			two = false;
			three = true;
		} else if (three == true) {
			three = false;
			more = true;
		} else if (more == true) {
			more = false;
			more = true;
		}
	}
}
