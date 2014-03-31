class TestExtendsVarAssign {
	public static void main(String[] args) {
	}
}

class A extends B {
	public int test(int a) {
		int cc;
		int bb;
		cc = c;
		bb = b;
		return a;
	}
}

class B extends C {
	int b;
}

class C {
	int c;
}

class D extends B {
	int b;
	int c;

	public int test(int x) {
		int b;
		int c;
		b = 1;
		c = 2;
		return x;
	}
}