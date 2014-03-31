//Tests a class extending one class, but attempts to reach a method of a class that it does not extend.
class TestExtends {
	public static void main(String[] args) {
		A a;
	}
}

class A extends B {
	int a;
	public int amethod1(int param) {
		int first;
		int second;
		A someClass;
		someClass = new A();
		first = someClass.bmethod1(2); //This line is okay.
		second = someClass.cmethod1(2); //This one is not.
		return 1;
	}
}

class B {
	int b;
	public int bmethod1(int param) {
		return 1;
	}
}

class C extends D {
	int c;
	public int cmethod1(int param) {
		return 1;
	}
}

class D {
	int d;
	public int dmethod1(int param) {
		return 1;
	}
}