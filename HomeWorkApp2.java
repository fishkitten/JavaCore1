public class HomeWorkApp2 {
	public static void main(String[] args) {
		boolean check = checkSum(5, 7);
		System.out.println(check);
		printSign(-1);
		printSign(1);
		boolean isNegative = isNegative(0);
		System.out.println(isNegative);
		printNTimes("A", 5);
		System.out.println(year(4));
		System.out.println(year(400));
		System.out.println(year(100));
		System.out.println(year(200));
		System.out.println(year(1203));
		System.out.println(year(1200));
	}	
	
	private static boolean checkSum(int k, int d) {
		int sum = k + d;
		if (sum >= 10 && sum <= 20) {
			return true;
		} else {
			return false;
		}
	}
	
	private static void printSign(int num) {
		if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Positive");
		}
	}
	
	private static boolean isNegative(int num) {
		return num < 0;
	}
	
	private static void printNTimes(String s, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(s);
		}
	}
	
	private static boolean year(int y) {
		return y % 400 == 0 || (y % 100 != 0 && y % 4 == 0);
	}
}

