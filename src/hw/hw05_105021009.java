package hw;

import java.util.Scanner;

public class hw05_105021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n;
		System.out.println("請輸入n值:");
		n = scn.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++){
			sum = (n*(n+1)*(n+2))/3;
		}
		System.out.println("答案:"+sum);
	}

}
