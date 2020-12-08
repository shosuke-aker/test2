package enshu4;

import java.util.Random;

public class Omikuji {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();

		int fortune = 0;
		fortune = rand.nextInt(4);
		if (fortune == 0) {
			System.out.println("大吉");
		} else if (fortune == 1) {
			System.out.println("中吉");
		} else if (fortune == 2) {
			System.out.println("末吉");
		} else {
			System.out.println("凶");
		}

	}

}
