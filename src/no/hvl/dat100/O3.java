package no.hvl.dat100;

import java.util.Scanner;

public class O3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int x = 2;
		System.out.println("Heltall?");
		int o = scanner.nextInt();
		int b = o;
		int n = 1;
		 if (o > 0) {
			 for (int i = 1; i < b; i++) {
				 n = n * 1 * x;
				 x++;
				 System.out.println(n);
			 }
		 }
		
	}

}
