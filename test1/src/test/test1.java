package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;
		int d;
		int m;
		int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int a = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도:");
		y = sc.nextInt();
		System.out.print("월:");
		m=sc.nextInt();
		System.out.print("일:");
		d=sc.nextInt();

		if ((((y%4==0)&&(y%100!=0))||y%400==0) && m==2)
			days[1] = 29;
		else if(!(((y%4==0)&&(y%100!=0))||y%400==0) && m==2 )
			days[1] = 28;
		

		d += (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100  + (y - 1) / 400;
        
        for (int i = 0; i < m - 1; i++)
            d += days[i];


        a = d % 7;
        
        switch(a)
        {
           case 0:
                System.out.print("일요일 "); 
                break;
  
            case 1:
                System.out.print("월요일 "); 
                break;
  
            case 2:
                System.out.print("화요일 "); 
                break;
  
            case 3:
                System.out.print("수요일 "); 
                break;
  
            case 4:
                System.out.print("목요일 "); 
                break;
  
            case 5:
                System.out.print("금요일 "); 
                break;
            
            case 6:
                System.out.print("토요일 "); 
                break;
        }
sc.close();

       
	}

}
