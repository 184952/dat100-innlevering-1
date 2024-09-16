package no.hvl.dat100;

import java.util.Scanner;

public class O2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Poeng?");
		int i;
		int x;
		for (i = 1; i <= 10; i++) {
		do {x = scanner.nextInt();}
		while(x > 100 || x < 0);
		int poeng = x;
		if (poeng > 100) {
			System.out.println("Feil poengsum");
		}
		else if (poeng >= 90) {
		System.out.println("A");
		}
		else if (poeng >= 80) {
			System.out.println("B");
		}
		else if (poeng >= 60) {
			System.out.println("C");
		}
		else if (poeng >= 50) {
			System.out.println("D");
		}
		else if (poeng >= 40) {
			System.out.println("E");
		}
		else if (poeng >= 0) {
			System.out.println("F");
			}
		else if (poeng < 0) {
			System.out.println("Feil poengsum");
			}
		System.out.println("Poeng?");
	}
	}
}
