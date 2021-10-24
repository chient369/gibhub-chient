package highcard;

import java.util.Random;

public class GameProcess {
	private Player player;
	static private int[] cardlist = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	static private Random rand = new Random();

	public GameProcess(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public static int getFirstCard() {
		return cardlist[rand.nextInt(13)];
	}

	public static int getSecondCard(int card_1) {
		int card_2 = cardlist[rand.nextInt(13)];
		while (card_1 == card_2) {
			card_2 = cardlist[rand.nextInt(13)];
		}
		return card_2;
	}

	public void gameProccess(GameProcess shobu) {
		boolean keizoku = true;
		System.out.println("ゲーム開始");
		System.out.println("🥀🥀🥀🥀🥀🥀🥀🥀🥀🥀");
		player.showPlayer();
		while (keizoku) {
			System.out.print("掛け金を入力してください : ");
			int kakekin = Input.inputKakekin();

			if (kakekin == 9999) {
				System.out.println("ゲーム終了");
				System.out.println("+-+-+-+-+-+-+-+-+-+-+-+");
				break;
			}
			if (kakekin > player.getShojikin()) {
				System.out.println("所持金以下の掛け金を入力してください　");
				kakekin = Input.inputKakekin();
			}

			int card_1 = GameProcess.getFirstCard();
			System.out.printf("カード1 : %d \n \n", card_1);

			System.out.println("カード2 は カード1 より： \n 0. 弱い \n 1. 強い \n 2. ピタリ賞を狙う");
			int sentaku = Input.inputSentaku();

			int card_2 = GameProcess.getSecondCard(card_1);
			if (sentaku != 2) {
				System.out.printf("カード　2 : %d \n \n", card_2);
			}
			shobu.kekka(sentaku, card_1, card_2, kakekin);
			Player player = shobu.getPlayer();
			if (player.getShojikin() < 100 || player.getShojikin() > 100000) {
				if (player.getShojikin() < 0) {
					player.saigo(kakekin);
				}
				System.out.println("ゲーム終了");
				System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+");

				keizoku = false;
			}

		}

	}

	public void kekka(int sentaku, int card_1, int card_2, int kakekin) {
		if (sentaku == 0) {
			if (card_1 > card_2) {
				player.kachi(kakekin);
				player.showPlayer();

			} else {
				player.make(kakekin);
				player.showPlayer();
			}

		} else if (sentaku == 1) {
			if (card_1 < card_2) {
				player.kachi(kakekin);
				player.showPlayer();
			} else {
				player.make(kakekin);
				player.showPlayer();
			}
		} else if (sentaku == 2) {
			pitari(card_2, kakekin);
		} else {
			System.err.println("正しく選択してください");
		}
	}

	public void pitari(int card_2, int kakekin) {
		System.out.print("次のカードはどの数値と思いますか : ");
		int yosoku = Input.inputCard();
		System.out.printf("結果。。。。 カード2　は： %d \n \n", card_2);
		if (card_2 == yosoku) {
			System.out.println("おめでとうございます！🎆🎆🎆");
			System.out.printf("ピタリ賞 : %d \n", 12 * kakekin);
			player.pitari(kakekin);
			player.showPlayer();
		} else {
			System.out.println("惜しかったね！\n");
		}
	}

}
