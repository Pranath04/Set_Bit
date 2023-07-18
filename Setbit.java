package set;

import java.util.Scanner;

public class Setbit{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int count=0;
		count = count  | 1<<a;
		count = count | 1<<b;
		System.out.print(count);
		System.out.println(b<<1);
	}
}