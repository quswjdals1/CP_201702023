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
System.out.print("���ڸ� �Է��Ͻÿ�:");
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
System.out.print("������"+y+"�� ������"+k+"�� �Դϴ�.");
sc.close();
	}

}
