import java.util.Arrays;

public class HomeWorkApp3 {
	public static void main(String[] args) {
		task1();
		task2();
		task3();
	}
	
	public static void task1() {
		int[] numbers = {1, 0, 0, 1, 1, 1};
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				numbers[i] = 1;
			} else {
				numbers[i] = 0;
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void task2() {
		int[] numbers = new int[100];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void task3() {
		int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 6) {
				numbers[i] = numbers[i] * 2;
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
}
