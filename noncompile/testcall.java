//Method call without assignment.
class TestCall { 
	public static void main ( String [] args ) {
		int a;
		Calculator b;
		a = 1;
		b.add(2+a, a);
	}
}

class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
}
