//Parentheses in the wrong place (wrong side of the plus).
class HelloWorld {
	public static void main(String[] args) {
		int a;
		if(true && (true && false) && false) {
			a = (5+2+3+)3;
		}
	}
}
