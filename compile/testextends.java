class TestExtends {
	public static void main(String[] args) {
		System.out.println(true);
	}
}

class A extends B {
	public C test(A a) {
		C c1;
		C c2;
		c1 = new B();
		c2 = this.testparam(c1, new A(), a);

		return c2;
	}

	public A testparam(C c, B b, A a) {
		return a;
	}
}

class B extends C {
	int b;
}

class C {
	int c;
}
