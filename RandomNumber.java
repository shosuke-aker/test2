package enshu4;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();

		int fortune = 0;//この数が乱数の数字になる。
		fortune = rand.nextInt(11);
		int number = fortune % 2;//2で割った余りが0か1か。これは余り、乱数を２で割った数字ではない。

		if (fortune < 5) {

		} else if (number == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		System.out.println(fortune);
	}

}
