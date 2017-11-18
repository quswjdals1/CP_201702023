package test;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1;
Scanner sc = new Scanner(System.in);
System.out.print("변환할 초 입력 :");
num1 = sc.nextInt();

int minute;
minute = num1 % 3600 / 60;
int hour;
hour = num1 / 3600;
int second;
second = num1 % 60;


{System.out.println(hour +"시");
System.out.print(minute + "분");
System.out.print(second + "초 입니다.");}


sc.close();



}


	}



