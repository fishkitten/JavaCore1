public class HomeWorkApp2 {
	public static void main(String[] args) {
	}	
	
	private static boolean checkSum(int k, int d) {
		int sum = k + d;
		if (sum >= 10 && sum <= 20) {
			return true;
		} else {
			return false;
		}
	}
}