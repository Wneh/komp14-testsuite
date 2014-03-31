class TestExtends {
	public static void main(String[] args) {
		A a;
	}
}

class A extends B {
	int a;
}

class B extends C {
	int b;
}

class C extends D {
	int a;
}

class D extends A {
	int a;
}
