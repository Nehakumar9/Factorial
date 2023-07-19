package factorial;

import java.util.Scanner;

public class Factorial {

	public static int findFactorail(int n) {
		if(n==1) {
			return 1;
		}
		return findFactorail(n-1)*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int results = findFactorail(n);
		System.out.println(results);
	}

}
