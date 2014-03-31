class TestLocalVars {
	public static void main(String[] args) {
		int hej;
		hej = 1;
		
		if(hej == 1) {
			int lokal1;
			int lokal2;
			int lokal3;
			lokal1 = 0;
			lokal2 = 1;
			lokal3 = 2;
			
			if(true) {
				int innelokal1;
				innelokal1 = lokal1 + lokal2;
				System.out.println(innelokal1);
			} else
				System.out.println(false);
		}
	}
}
