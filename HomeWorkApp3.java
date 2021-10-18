import java.util.Arrays;

public class HomeWorkApp3 {
	public static void main(String[] args) {
		task1();	
	}
	
	public static void task1() {//task
		int[] numbers = {1,0,0,1,1,1};
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				numbers[i] = 1;
			} else {
				numbers[i] = 0;
			}
	    }
		System.out.println(Arrays.toString(numbers));
	}
}
