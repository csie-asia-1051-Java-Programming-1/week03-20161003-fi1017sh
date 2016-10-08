package hw;

import java.util.Scanner;

public class hw04_105021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n;
		System.out.println("請輸入n值:");
		n = scn.nextInt();
		int i=n--;
		int sum = 1;
		while(i>0){//條件
			sum =sum*i;//運算主體
			i--;//增減量
		}
		System.out.println("答案:"+sum);
	}

}
