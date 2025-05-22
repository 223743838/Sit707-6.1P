package sit707_week6;

public class LoopUtils {
	
	// (a) Loop with simple statements
    public static int sumFirstNIntegers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // simple instruction
        }
        return sum;
    }

    // (b) Loop with conditional statements
    public static int countEvenNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { // conditional inside loop
                count++;
            }
        }
        return count;
    }

}
