package test;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1;
Scanner sc = new Scanner(System.in);
System.out.print("��ȯ�� �� �Է� :");
num1 = sc.nextInt();

int minute;
minute = num1 % 3600 / 60;
int hour;
hour = num1 / 3600;
int second;
second = num1 % 60;


{System.out.println(hour +"��");
System.out.print(minute + "��");
System.out.print(second + "�� �Դϴ�.");}


sc.close();



}


	}



