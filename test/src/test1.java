import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String n;
int x=0;
int y=0;
int i;

Scanner sc = new Scanner(System.in);
int m = (int)(Math.random()*10) + 1;

for(i=0; i<7; i=i+1) {
System.out.print("���������� �Է�:");
n=sc.nextLine();
if (m==1|| m==4|| m==7)
	System.out.println("��ǻ�ʹ� ����");
else if(m==2|| m==5|| m==8)
	System.out.println("��ǻ�ʹ� ����");
else if(m==3|| m==6|| m==9)
	System.out.println("��ǻ�ʹ� ��");


if (n.equals("��") && (m==1||m==4||m==7)) {
	System.out.println("����");
	y=y+1;
	System.out.println("�����"+ x + "�� ��ǻ��" + y);}
else if(n.equals("��")&&(m==2||m==5||m==8)) {
	System.out.println("�̰��");
	x=x+1;
	System.out.println("�����"+ x + "�� ��ǻ��" + y);}
else if(n.equals("��")&& m==3||m==6||m==9) {
	System.out.println("����(����0��)");
    System.out.println("�����"+x +"�� ��ǻ��" +y);}
else if (n.equals("����") && (m==1||m==4||m==7)) {
	System.out.println("�̰��");
	x=x+1;
	System.out.println("�����"+ x + "�� ��ǻ��" + y);}
else if(n.equals("����")&&(m==2||m==5||m==8)) {
	System.out.println("����(����0��)");
	System.out.println("�����"+ x + "�� ��ǻ��" + y);}
else if(n.equals("����")&& m==3||m==6||m==9) {
	System.out.println("����");
	y=y+1;
    System.out.println("�����"+x +"�� ��ǻ��" +y);}
else if (n.equals("����") && (m==1||m==4||m==7)) {
	System.out.println("����(����0��)");
	System.out.println("�����"+ x + "�� ��ǻ��" + y);}
else if(n.equals("����")&&(m==2||m==5||m==8)) {
	System.out.println("����");
	y=y+1;
	System.out.println("�����"+ x + "�� ��ǻ��" + y);}
else if(n.equals("����")&& m==3||m==6||m==9) {
	System.out.println("�̰��");
	x=x+1;
    System.out.println("�����"+x +"�� ��ǻ��" +y);}
}
sc.close();
	}

}
