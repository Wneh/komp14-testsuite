class TestFieldMethodSameName {
	public static void main(String[] args) {
	}
}

class Test {
	int add;
	int sub;

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int Test() {
		Test Test;
		int x;
		while(true) {
			if(true) {
				if(true) {
					x = this.add(this.add(add,add),sub) + this.Test();
				} else {

				}
			} else {
			}
		}
		return new Test2().getTest().add(Test.add(add,add),sub) + Test.sub(add,sub);
	}
}

class Test2 {
	public Test getTest() {
		return new Test();
	}

	public int Test() {
		return 1;
	}
}