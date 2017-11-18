package test3;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s;
int i;

Scanner sc = new Scanner(System.in);
System.out.print("문자를 입력하세요: ");
s=sc.nextLine();
char w[] = s.toCharArray();

for (i=0; i<s.length(); i++) {
	
	
	if(w[i]>=65 && w[i]<=90)
		w[i]+=32;
	
	else if (w[i]<=122 && w[i]>=97)
		w[i]-=32;
}
		
System.out.print(w);
sc.close();
	
	

	}

}
