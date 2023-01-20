import java.util.Scanner;
public class ArraySumOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		int[] num = new int[10];
		System.out.println("Enter the 10 integer:");

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			}
	
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even += num[i];
			}

			if (num[i] % 2 != 0) {
				odd += num[i];
			}
		}

		System.out.println("The sum of even integer is: " + even);

		System.out.println("The sum of odd integer is: " + odd);
	}	
}