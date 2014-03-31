//Tests assigning an object of class B to a new object of class C, when C does not extend B.
class TestExtends {
	public static void main(String[] args) {
		A a;
	}
}

class A extends B {
	int a;
	public int amethod1(int param) {
		B b;
		int result;
		b = new C(); //Not ok.
		return 1;
	}
}

class B {
	int b;
	public int bmethod1(int param) {
		return 1;
	}
}

class C {
	public int cmethod1(int param) {
		return 1;
	}
}