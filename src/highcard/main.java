package highcard;

import java.util.Scanner;

public class main {
	private static PlayerService playerService = new PlayerService(new PlayerManege());
	private static Scanner sc = new Scanner(System.in);
	private static boolean check_loop = true;

	public static void main(String[] args) {

		while (check_loop) {

			System.out.println("こんにちは \n 1. スタート \n 2.　ユーザー管理 \n 0. ゲーム終了");
			int inp = Input.inputSentaku();
			switch (inp) {
			case 1:
				System.out.println("あなたの名前を入力してください");
				String playerName = sc.next();
				Player player = playerService.createPlayer(playerName);
				GameProcess shobu = new GameProcess(player);
				shobu.gameProccess(shobu);
				break;
			case 2:
				playerService.playerService();
				break;
			case 0:
				check_loop = false;
			default:
				System.err.println("正しく入力してください");
				inp = Input.inputSentaku();
			}

		}

	}
}