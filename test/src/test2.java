import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int y;
int d;
int m;
int days;

Scanner sc = new Scanner(System.in);
System.out.print("����:");
y = sc.nextInt();
System.out.print("��:");
m=sc.nextInt();
System.out.print("��:");
d=sc.nextInt();

if ((((y%4==0)&&(y%100!=0))||y%400==0) && m==2)
	days = 29;
else if(!(((y%4==0)&&(y%100!=0))||y%400==0) && m==2 )
	days = 28;
else if((m == 1) || (m == 3) || (m == 5) || (m == 7)
		|| (m == 8) || (m == 10) || (m == 12))
	days = 31;
else
	days = 30;


if (m == 1 || m == 2) y--;
m = (m + 9) % 12 + 1;
int q = y % 100;
int x = y / 100;
int week = ((13 * m - 1) / 5 + d + q + q/4 + x/4 - 2*x) % 7;
if (week < 0) week = (week + 7) % 7;
String week2 = "";
switch(week) {
   case 0:
      week2 = "�Ͽ���";
      break;
   case 1:
      week2 = "������";
      break;
   case 2:
      week2 = "ȭ����";
      break;
   case 3:
	   week2 = "������";
      break;
   case 4:
	   week2 = "�����";
      break;
   case 5:
	   week2 = "�ݿ���";
      break;
   case 6:
	   week2 = "�����";
      break;
}
System.out.println(week2 + " �Դϴ�.");
sc.close();

}
   }
