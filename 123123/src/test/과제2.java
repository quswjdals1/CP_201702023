package test;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1;
Scanner sc = new Scanner(System.in);
System.out.print("�⵵�� �Է� �Ͻÿ� : ");
num1 = sc.nextInt();

if ((num1%4) == 0 && (num1 % 100)!=0)
	System.out.println(num1 + "�� �����Դϴ�.");

else if ((num1 % 400) == 0 && (num1 % 100)!=0)
	System.out.println(num1 + "�� �����Դϴ�.");

else 
	System.out.println(num1 + "�� ������ �ƴմϴ�.");

sc.close();

	
	}

}
