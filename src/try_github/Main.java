package try_github;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println("足し算"+Add.add(a,b));
		System.out.println("引き算"+Pull.pull(a,b));
    }

}
