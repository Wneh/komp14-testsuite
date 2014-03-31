class TestExtendsVarAssign {
	public static void main(String[] args) {
	}
}

class A extends B {
	public int test(int x) {
		C c1;
		C c2;
		C c3;
		c1 = new A();
		c2 = new B();
		c2 = new C();

		System.out.println(c1.testoverride(0, 0) == c1.testoverride(0, 0));
		System.out.println(c2.testoverride(1, 1) == c2.testoverride(1, 1));
		System.out.println(c3.testoverride(2, 2) == c3.testoverride(2, 2));
		System.out.println(this.testoverride(0, 0) == this.testoverride(0, 0));

		return 0;
	}

	public C testoverride(int a, int b) {
		return new A();
	}
}

class B extends C {
	public int testmethod1(int a) {
		int x;
		x = 2;
		return a + x;
	}

	public C testoverride(int a, int b) {
		int x;
		x = 0;
		return new B();
	}
}

class C {
	public C testoverride(int a, int b) {
		int c;
		int d;
		c = a + b;
		d = a - b;
		return new C();
	}

	public int testmethod2(int a) {
		int c;
		int d;
		c = 2;
		d = c;
		return a + 1;
	}
}