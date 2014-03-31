class TestExtendsVarAssign {
	public static void main(String[] args) {
	}
}

class A {
	public int test1(int x) {
		int y;
		int z;
		A a;
		boolean b;
		a = new A();

		y = this.test2(x) + this.test2(x);
		z = a.test2(x) + a.test2(x);
		b = a.test3(x) || a.test3(x);
		b = a.test3(x) || a.test3(x) || a.test3(x);
		return 0;
	}

	public int test2(int x) {
		return 0;
	}

	public boolean test3(int x) {
		return true;
	}
}