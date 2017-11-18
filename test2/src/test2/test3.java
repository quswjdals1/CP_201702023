package test2;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String n;

Scanner sc = new Scanner(System.in);
System.out.print("문자를 입력하세요:");
n=sc.nextLine();

switch (n) {
case "o":
	System.out.println("모음입니다.");
	break;
	
case "a":
	System.out.println("모음입니다.");
	break;
	
case "e":
	System.out.println("모음입니다.");
	break;
	
case "i":
	System.out.println("모음입니다.");
	break;
	
case "u":
	System.out.println("모음입니다.");
	break;
	
default:
	System.out.println("자음입니다");
	break;
}
sc.close();

	}

}
