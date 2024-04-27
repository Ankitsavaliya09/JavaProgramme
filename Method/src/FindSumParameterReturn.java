class FindSumParameterReturn {
	public static void main(String[] args) {
		int result = findsum(10, 20);
		System.out.println(result);
	}

	static int findsum(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}
}