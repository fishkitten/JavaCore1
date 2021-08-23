public class HomeWorkApp2 {
	public static void main(String[] args) {
		boolean check = checkSum(5, 7);
		System.out.println(check);
		printSign(-1);
		printSign(1);
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
}
