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
		System.out.print("����:");
		y = sc.nextInt();
		System.out.print("��:");
		m=sc.nextInt();
		System.out.print("��:");
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
                System.out.print("�Ͽ��� "); 
                break;
  
            case 1:
                System.out.print("������ "); 
                break;
  
            case 2:
                System.out.print("ȭ���� "); 
                break;
  
            case 3:
                System.out.print("������ "); 
                break;
  
            case 4:
                System.out.print("����� "); 
                break;
  
            case 5:
                System.out.print("�ݿ��� "); 
                break;
            
            case 6:
                System.out.print("����� "); 
                break;
        }
sc.close();

       
	}

}
