package highcard;

import java.util.Scanner;

public final class Input {
	private static Scanner sc = new Scanner(System.in);

	public static int inputKakekin() {
		int kakekin = 0;
		String input = sc.next();
		boolean check = true;
		while (check) {
			try {
				kakekin = Integer.parseInt(input);
				check = false;
				if (kakekin < 0) {
					System.err.println("非負の掛け金を入力してください");
					input = sc.next();
					check = true;

				}

			} catch (Exception e) {
				System.err.println("正しく入力してください");
				input = sc.next();
				check = true;
			}
		}
		return kakekin;
	}
	public static int inputCard() {
		int card = 0;
		String input = sc.next();
		boolean check = true;
		while (check) {
			try {
				card = Integer.parseInt(input);
				check = false;
				if (card < 0 || card > 13) {
					System.err.println("予測のカードは0以上、13以下を入力すること！");
					input = sc.next();
					check = true;

				}

			} catch (Exception e) {
				System.err.println("正しく入力してください");
				input = sc.next();
				check = true;
			}
		}
		return card;
	}

	public static int inputSentaku() {
		int sentaku = 0;
		String input = sc.next();
		boolean check = true;
		while (check) {

			try {
				sentaku = Integer.parseInt(input);
				check = false;
				if (sentaku < 0 || sentaku > 2) {
					System.err.println("正しく選択してください");
					input = sc.next();
					check = true;
				}
			} catch (Exception e) {
				System.err.println("正しく入力してください");
				input = sc.next();
				check = true;

			}
		}
		return sentaku;	
	}
	public static int inputChoose() {
		int choose = 0;
		String input = sc.next();
		boolean check = true;
		while (check) {

			try {
				choose = Integer.parseInt(input);
				check = false;
				
			} catch (Exception e) {
				System.err.println("正しく入力してください");
				input = sc.next();
				check = true;

			}
		}
		return choose;	
	}


}
