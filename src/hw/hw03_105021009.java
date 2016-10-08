package hw;

import java.util.Scanner;

public class hw03_105021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入正整數 n=");
		int n = scn.nextInt();
		int sum = 1;
		for(int i=n;i>0;i--){
			sum =sum*i;
		}
		System.out.println("答案:"+sum);
	}

}
