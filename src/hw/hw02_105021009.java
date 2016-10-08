package hw;


import java.util.Scanner;

public class hw02_105021009 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.print("請輸入所有數值:");
		String test;
		Scanner scn = new Scanner(System.in);
		test = scn.next();
		int t = Integer.parseInt(test);
		int x=0,y=0,z=0;
		for(String i=test;t=;t++){
			if(t>0){
				x++;
			}
			if(t==0){
				y++;
			}
			
			if(t<0){
				z++;
			}
		}
		System.out.println("共有" + x +"個正數");
		System.out.println("共有" + y +"個零");
		System.out.println("共有" + z +"個負數");
	
	}

}
