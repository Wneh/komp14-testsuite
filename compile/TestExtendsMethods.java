class TestExtendsMethods {
	public static void main(String[] args) {
	}
}

class A {
	public boolean testA(int a) {
		return true;
	}
}

class Test {
	public int test() {
		B b;
		boolean myBool;
		b = new B();
		myBool = b.testA(1);
		return 0;
	}
}

class B extends A {
	public boolean testB(int b) {
		return false;
	}
}