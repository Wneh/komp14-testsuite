class TestCall { 
	public static void main ( String [] args ) {
		int a;
		boolean c;
		Calculator b;
		A obj;
		a = 1;
		a = b.add(2+a, a);

		obj = new A();
		a = obj.getA();
		a = obj.getB();
		a = (new A()).getA();
		a = obj.newA().getA();
		obj = obj.newA();

		obj = obj.testA(obj.testA(obj, obj), obj.testA(obj, obj));

		c = !obj.getC() && !obj.getC();
		c = !(obj.getA() < obj.getB()) && obj.getA() < obj.getB();
		c = !obj.getC();
		c = !!obj.getC();
		c = !!!obj.getC();

		c = !obj.newA().newA().getC();
	}
}

class A {
	int a;
	int b;
	boolean c;

	public A newA() {
		return new A();
	}

	public A testA(A a, A b) {
		return a;
	}

	public int getA() {
		b = this.getA();
		return a;
	}

	public int Add(int a, int b) {
		return a + b;
	}

	public int getB() {
		return b;
	}

	public boolean getC() {
		return c;
	}

	public int Sort(int left, int right) {
		int i ;
		int nt;
		if(true) {
			nt = this.Sort(left,i-1);
		}
		else {
			nt = 0;
		}
		return 0;
	}
}

class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
}

class B {
	int a;
	int b;

	public A newA() {
		return (new A()).testA(new A(), new A());
	}
}