package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Scanner sc= new Scanner(System.in);
System.out.print("입력해씨발년아");
String s=sc.nextLine();

int x=0;
int y =0;

for(int i=0; i<=s.length()-1; i++) {
switch(s.charAt(i)) {

case 'e': case 'i': case 'o': case'a': case 'u':
	x++;
	break;
default:
	y++;
	break;
}
}
System.out.print("자음의 개수"+x+"모음의개수"+y);
	}

}
