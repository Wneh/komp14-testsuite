class TestExtensions {
	public static void main(String[] args) {
		System.out.println(true);
	}
}
class Test {
	boolean a;
	boolean b;
	long c;
	long[] d;

	public int danne(int c, int v) {
		//Test basic operators
		if(c < v)
			System.out.println(true);
		if(c > v)
			System.out.println(true);
		if(c == v)
			System.out.println(true);
		if(c != v)
			System.out.println(true);
		if(a && b)
			System.out.println(true);
		if(c <= v)
			System.out.println(true);
		if(c >= v)
			System.out.println(true);

		//Test grouped operators
		if(a && b || !a && !b)
			System.out.println(true);
		if(a && b || b && a || !a && !b)
			System.out.println(true);
		if(c == v && c != v || c < v)
			System.out.println(true);
		if(c * v + v != c - c * v && !a || !b)
			System.out.println(true);

		//Test grouped method calls
		if(this.testInt(c) + this.testInt(v) != this.testInt(c))
			System.out.println(true);
		if(this.testInt(c) + this.testInt(v) < this.testInt(c) - this.testInt(v))
			System.out.println(true);
		if(this.testBool(b) || !this.testBool(a))
			System.out.println(true);
		if(!this.testBool(b) || !this.testBool(a))
			System.out.println(true);
		if(this.testInt(c) + this.testInt(v) != this.testInt(c) && a || !this.testBool(a))
			System.out.println(true);
		return c;
	}

	public int testInt(int a) {
		return a;
	}

	public boolean testBool(boolean a) {
		return a;
	}
}