class TestCall { 
	public static void main ( String [] args ) {
		//int hej;
		//hej = this.main(args);
	}
}

class Test { 
	public int hej(int x) {
		x = this.hej(x);
		return x;
	}
}