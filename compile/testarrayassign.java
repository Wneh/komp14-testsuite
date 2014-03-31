class TestArrayAssign {
	public static void main(String[] args) {
	} 
}

class Test  {
	int[] number;

	public int test() {
		int i;
		int j;
		i = 1;
		j = 2;
		number = new int[10];
		number[i] = number[j];
		number = number;
		return number[i];
	}
}