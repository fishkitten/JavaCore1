public class HomeWorkApp {
	public static void main(String[] args) {
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	
	private static void printThreeWords() {
		System.out.println("_Orange");
		System.out.println ("_Banana");
		System.out.println ("_Apple");
	}
	
	private static void checkSumSign() {
		int a = -1000000;
		int b = 2000000;
		if (a + b >= 0) {
			System.out.println("Сумма положительная");
		} else {
			System.out.println("Сумма отрицательная");
		}		
	}
	
	private static void printColor() {
		int value = -500;
		if (value <= 0) {
			System.out.println("Красный");
		} else if (value <= 100) {
			System.out.println("Желтый");
		} else {
			System.out.println("Зеленый");
		}
	}
	
	private static void compareNumbers() {
		int a = 98;
		int b = 47;
		if (a >= b) {
			System.out.println ("a >= b");
		} else {
			System.out.println ("a < b");
		}
	}		
}
