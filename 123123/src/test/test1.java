package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Scanner sc= new Scanner(System.in);
System.out.print("�Է��ؾ��߳��");
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
System.out.print("������ ����"+x+"�����ǰ���"+y);
	}

}
