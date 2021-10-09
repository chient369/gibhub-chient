package Dai1Kai;

import java.util.Scanner;

public class NanMon {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		boolean check = true;

		System.out.println("Hello! ");
		drawSym();

		while (check) {
			System.out.println("\n-----------------------\n 1.Start \n 2.Exits");
			byte sentaku = Input();
			switch (sentaku) {
			case 1:
				/*
				 * 性別条件の分岐処理 1の入力したら、男性に選択する 2＝＞女性を選択する 3＝＞データなしを出力し、処理を終わる
				 */
				System.out.println("\n性別： \n 1.男性 \n 2.女性 \n 3.他");
				byte sei = Input();
				bunSeki(sei);

				break;
			case 2:
				System.out.println("Code By 1_B_ChienCt\n Thanks you! Bye");
				/*
				 * exitsを選択したら、 false をcheck変数に代入して繰り返しの処理を抜き出す
				 */
				check = false;
				break;

			default:
				System.err.println("正しく入力してください ");

				break;
			}

		}

	}

	static void bunSeki(byte sei) {
		// 男性の場合
		if (IS_MALE(sei)) {

			System.out.println("\n職業は： \n 1. 営業職 \n 2. エンジニア \n 3.他");
			byte occup = Input();
			if (IS_ENGINEER(occup)) {
				System.out.println("あなたが思い浮かべたのはBさんです！");

			} else if (IS_SALE(occup)) {
				System.out.println("\n魚が嫌いですか。\n 1. はい \n 2. いいえ");
				byte res = Input();
				if (IS_YES(res)) {
					System.out.println("\n肉が好きですか！\n 1. はい \n 2. いいえ");
					byte fav = Input();
					if (IS_YES(fav)) {
						System.out.println("あなたが思い浮かべたのはCさんです！");
					} else {
						System.out.println("あなたが思い浮かべたのはAさんです！");

					}

				} else {
					System.out.println("データなし、わからん＞。＜");
				}

			} else {
				System.out.println("データなし、わからん＞。＜");
			}
			// 女性の場合

		} else if (IS_FEMALE(sei)) {
			System.out.println("\n職業は： \n 1. 営業職 \n 2. エンジニア \n 3.他");
			byte occup = Input();
			/*
			 * 特待する人物から見ると、女性3人の中にFさんだけ営業職があるから IS_SALEメソッドは人物の職業は営業職かどうかをチェックする
			 * 営業職だったら、trueをリターンし、Fさんの結果を出力する そうでなければ、次の条件をみる
			 */
			if (IS_SALE(occup)) {
				System.out.println("あなたが思い浮かべたのはFさんです！");
				/*
				 * 特待する人物から見ると、女性3人の中にFさんとDさんが営業職があるから IS_ENGINEERメソッドは人物の職業はエンジニアかどうかをチェックする
				 * DさんとEさんのデータから見る、すきな動物が違うからその条件を設定する
				 * 
				 */
			} else if (IS_ENGINEER(occup)) {
				System.out.println("\n犬と猫どっち好き？。\n 1. 犬 \n 2. 猫");
				byte fav = Input();
				if (fav == 1) {
					System.out.println("あなたが思い浮かべたのはDさんです！");
				} else {
					System.out.println("あなたが思い浮かべたのはEさんです！");

				}

			} else {
				System.out.println("データなし、わからん＞。＜");
			}

		} else {
			System.out.println("データなし、わからん＞。＜");
		}

	}

//入力をチェックする
	static byte Input() {
		System.out.print("\n答え：　");
		byte output = 0;
		String inp = sc.next();
		boolean check = true;
		while (check) {
			// 例外処理
			try {
				/*
				 * Byte.parseByte(String str) String型変数からバイト型変数に変えるメソッド
				 * 
				 * 
				 */
				output = Byte.parseByte(inp);
				/*
				 * 選択肢は１,２,３しか設定してないので、もしアウトプットは4以上、または負の値だったら、 エラーを出力し、もう一回入力の処理を実行する
				 * 
				 */

				if (output > 3 || output <= 0) {
					System.err.println("エラー！正しく選択してください");
					System.out.print("答え： ");
					inp = sc.next();
				}
				/*
				 * 正しく入力したら、繰り返し処理を抜き出す
				 */
				check = false;

			} catch (Exception e) {
				/*
				 * エラーが出たら、エラーメッセージを出力し、もう一回入力処理を実行する
				 */
				System.err.println("エラー！正しく選択してください");
				System.out.print("答え： ");
				inp = sc.next();

			}
		}
		return output;

	}

	private static boolean IS_MALE(byte sei) {
		if (sei == 1) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean IS_FEMALE(byte sei) {
		if (sei == 2) {
			return true;
		}
		return false;
	}

	private static boolean IS_SALE(byte occup) {
		if (occup == 1) {
			return true;
		}
		return false;
	}

	private static boolean IS_ENGINEER(byte occup) {
		if (occup == 2) {
			return true;
		}
		return false;
	}

	/*
	 * YESかNOかをチェックメソッド、戻り値はboolean バイトデータ型resのパラメーターを受け取り、 1ならば、true をリターンする
	 * 2ならば、falseをリターンする
	 */
	private static boolean IS_YES(byte res) {
		if (res == 2) {
			return false;
		}
		return true;
	}

	/*
	 * シンボルを出力する処理
	 */
	private static void drawSym() {
		int i, j;
		for (i = 1; i < 7; i++) {
			for (j = 1; j <= 7; j++) {
				if (!((i == 1 && (j == 1 || j == 4 || j == 7)) || (i == 4 && (j == 1 || j == 7))
						|| (i == 5 && (j <= 2 || j >= 6)) || (i == 6 && (j <= 3 || j >= 5)))) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
