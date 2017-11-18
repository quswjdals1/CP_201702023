package test3;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int i;
		int k=0;
		int y=0;
		
Scanner sc = new Scanner(System.in);
System.out.print("문자를 입력하시오:");
s=sc.nextLine();

for(i = 0; i<s.length(); i++ ) {
	char m =s.charAt(i);
	switch(m) {
	case 'a': case 'u': case 'e': case 'o': case 'i': 
		k++;
		break;
	default:
		y++;
		break;
	}
}
System.out.print("자음은"+y+"개 모음은"+k+"개 입니다.");
sc.close();
	}

}
