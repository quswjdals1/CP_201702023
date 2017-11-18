package test3;

import java.util.Scanner;

public class wadf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("계좌1 정보 입력");
		System.out.print("예금주: ");
		String owner=sc.nextLine();
		System.out.print("계좌번호: ");
		int accountNumber=sc.nextInt();
		System.out.println("초기잔액: ");
		int balance=sc.nextInt();
		sc.close();
	}

}
