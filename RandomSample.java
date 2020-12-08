package sample2;

import java.util.Random;

public class RandomSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//宣言部分
		Random rand=new Random();
		
		int fortune=0;
		//処理部分
		
		fortune=rand.nextInt(3);//左辺に0～2までの数字をランダムで代入する。
		System.out.println(fortune);

	}

}
