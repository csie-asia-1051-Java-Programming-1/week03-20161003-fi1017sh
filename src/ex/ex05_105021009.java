package ex;

import java.util.Scanner;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021009  陳俞儒
 */

public class ex05_105021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		if(x%2==0){
			System.out.println("偶數");
		}else{
			if(x%2!=0){
				System.out.println("奇數");
			}
		}
	}

}
