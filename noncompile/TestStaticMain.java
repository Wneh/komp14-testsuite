class TestStaticMain {
	public static void main(String[] args) {
		boolean b;
		b = new Test().test(this);
	}
}

class Test {
	public boolean test(TestStaticMain main) {
		return true;
	}
}