package test2;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String n;

Scanner sc = new Scanner(System.in);
System.out.print("���ڸ� �Է��ϼ���:");
n=sc.nextLine();

switch (n) {
case "o":
	System.out.println("�����Դϴ�.");
	break;
	
case "a":
	System.out.println("�����Դϴ�.");
	break;
	
case "e":
	System.out.println("�����Դϴ�.");
	break;
	
case "i":
	System.out.println("�����Դϴ�.");
	break;
	
case "u":
	System.out.println("�����Դϴ�.");
	break;
	
default:
	System.out.println("�����Դϴ�");
	break;
}
sc.close();

	}

}
