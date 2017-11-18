package test;

import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1;
Scanner sc = new Scanner(System.in);
System.out.print("년도를 입력 하시오 : ");
num1 = sc.nextInt();

if ((num1%4) == 0 && (num1 % 100)!=0)
	System.out.println(num1 + "는 윤년입니다.");

else if ((num1 % 400) == 0 && (num1 % 100)!=0)
	System.out.println(num1 + "는 윤년입니다.");

else 
	System.out.println(num1 + "는 윤년이 아닙니다.");

sc.close();

	
	}

}
