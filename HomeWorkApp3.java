import java.util.Arrays;

public class HomeWorkApp3 {
	public static void main(String[] args) {
		task1();
		task2();
		task3();
		System.out.println(Arrays.toString(task5(9, -100)));
		task4();
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
	
	public static void task4() {
		int[][] square = new int[5][5];
		for(int i = 0; i < square.length; i++) {
			for(int j = 0; j < square[i].length; j++) {
				if (i == j) {
					square[i][j] = 1;
				} else if (i + j == 4) {
					square[i][j] = 1;
				}
			}	
		}
		print2DArray(square);
	}
	
	public static int[] task5(int len, int initialValue) {
		int[] numbers = new int[len];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = initialValue;
		}
		return numbers;
	}
	
	private static void print2DArray(int[][] arr) {
		for (int i = 0, n = arr.length; i < n; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}			
	}
}
