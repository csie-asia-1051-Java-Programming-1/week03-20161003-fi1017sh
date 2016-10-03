package ex;

import java.util.Scanner;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021009  陳俞儒
 */

public class ex03_105021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char i = scn.next().charAt(0);
		if(65<=(int)i && (int)i<=90){
			int x = (int)i+32;
			System.out.println("轉換小寫="+(char)x);
		}else{
			if(97<=(int)i && (int)i<=122){
				int y = (int)i-32;
				System.out.println("轉換大寫="+(char)y);
		}
		
			
			
	}
	}

}

