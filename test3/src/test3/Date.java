package test3;

import java.util.Scanner;

public class Date {
	
	int y;
	int m;
	int d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		System.out.print("연도 입력: ");
		date.y=sc.nextInt();
		System.out.print("월 입력: ");
		date.m=sc.nextInt();
		System.out.print("일 입력: ");
		date.d=sc.nextInt();
		
		date.printEastern();
		date.printWestern();
		
	}
	
	public void printEastern() {
		System.out.print(y+". "+m+". "+d+". ");
	}
	
	public void printWestern() {
		if (m==1)
			System.out.print("january"+d+'.'+y);
		else if(m==2)
			System.out.print("Febuary"+d+'.'+y);
		else if(m==3)
			System.out.print("March"+d+'.'+y);
		else if(m==4)
			System.out.print("April"+d+'.'+y);
		else if(m==5)
			System.out.print("May"+d+'.'+y);
		else if(m==6)
			System.out.print("June"+d+'.'+y);
		else if(m==7)
			System.out.print("July"+d+'.'+y);
		else if(m==8)
			System.out.print("August"+d+'.'+y);
		else if(m==9)
			System.out.print("September"+d+'.'+y);
		else if (m==10)
			System.out.print("October"+d+'.'+y);
		else if (m==11)
			System.out.print("November"+d+'.'+y);
		else if (m==12)
			System.out.print("December"+d+'.'+y);
		
	}

}
