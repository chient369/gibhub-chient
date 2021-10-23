package Dai1Kai;

import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] cardList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int card_1 = cardList[rand.nextInt(13)]; //
			int card_2 = cardList[rand.nextInt(13)]; //
			System.out.println("ban dau la " + card_2);
			while (card_1 == card_2) {
				card_2 = cardList[rand.nextInt(13)];

			}
			System.out.println(card_1);
			System.out.println(card_2);
			System.out.println("-----------");

		}
	}

}
