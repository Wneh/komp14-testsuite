//Tests a class A extending one class B, and class B attempting to reach the scope of class A. 
class TestExtends {
	public static void main(String[] args) {
		A a;
	}
}

class A extends B {
	int a;
	public int amethod1(int param) {
		return 1;
	}
}

class B {
	int b;
	public int bmethod1(int param) {
		int first;
		first = this.amethod1(2); //This line is not ok.
		return 1;
	}
}