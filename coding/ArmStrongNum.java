package coding;

import java.util.Scanner;

public class ArmStrongNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = s.nextInt();
		int nums = num;
		int sum = 0;
		while (num > 0) {
			sum = sum + (num % 10) * (num % 10) * (num % 10);
			num = num / 10;
		}
		if (sum == nums) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong number");
		}
	}
}
