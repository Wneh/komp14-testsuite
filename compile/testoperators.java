class TestExtensions {
	public static void main(String[] args) {
		System.out.println(true);
	}
}
class Test {
	boolean a;
	boolean b;
	int c;
	int[] d;

	public int danne(int c, int v) {
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
		d = new int[10];
		return c;
	}
}
