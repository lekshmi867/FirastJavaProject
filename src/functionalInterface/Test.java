package functionalInterface;

class Test {
	public static void main(String args[]) {
		int a = 6, b = 10;

		// lambda expression to define the calculate method
//        Calculation s = new Calculation() {
//			
//			@Override
//			public int calculate(int x, int y) {
//				int z = x+y;
//				return z;
//			}
//		};

		Calculation s = (x, y) -> x + y;
		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a, b);
		System.out.println(ans);
	}
}