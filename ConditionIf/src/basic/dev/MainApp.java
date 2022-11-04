package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tháng ");
		int n = sc.nextInt();

		if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
			System.out.println("Tháng " + n + " có 31 ngày");
		} else if (n == 4 || n == 6 || n == 9 || n == 11) {

			System.out.println("Tháng " + n + " có 30 ngày");
		}else 
			if(n == 2) {
			System.out.println("Tháng "+ n + " có 29 hoặc ngày");
		}
	}

}
