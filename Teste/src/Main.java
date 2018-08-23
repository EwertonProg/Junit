import java.util.Scanner;

import fatorial.Fatorial;

public class Main {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Adicione um numero e descrubra seu fatorial: ");
		int i = in.nextInt();
		System.out.println(Fatorial.calcFor(i));
		System.out.println(Fatorial.calcRec(i));
	}
}
