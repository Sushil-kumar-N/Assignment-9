import java.util.Scanner;
public class MaxSum {

	static int even = 0;
	static int odd = 0;
	public static void maximumSum(int num[], int size) {
		for (int i = 0; i < size; i++) {
			if (num[i] % 2 == 0) {
				even += num[i];
			}
			if (num[i] % 2 != 0) {
				odd += num[i];
			}
		}
		System.out.println(Math.max(even, odd));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[20];
		int size;
		System.out.println("Enter the size ");
		size = sc.nextInt();
		if (size >= 0) {
			System.out.println("Enter the numbers");
			for (int i = 0; i < size; i++) {
				num[i] = sc.nextInt();
			}
			maximumSum(num, size);
		}else {
			System.out.println("Invalid array size");
		}
	}
}