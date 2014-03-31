class TestExtendsVarAssign {
	public static void main(String[] args) {
	}
}

class A extends B {
	public C testreturn1(int x) {
		return new A();
	}

	public C testreturn2(int x) {
		return new B();
	}

	public B testreturn3(int x) {
		return new A();
	}

	public C testreturn4(int x) {
		B b;
		if(true) {
			b = new B();
		} else {
			b = new A();
		}
		return b;
	}
}

class B extends C {
	int b;
}

class C {
	int c;
}