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
System.out.print("가위바위보 입력:");
n=sc.nextLine();
if (m==1|| m==4|| m==7)
	System.out.println("컴퓨터는 가위");
else if(m==2|| m==5|| m==8)
	System.out.println("컴퓨터는 바위");
else if(m==3|| m==6|| m==9)
	System.out.println("컴퓨터는 보");


if (n.equals("보") && (m==1||m==4||m==7)) {
	System.out.println("졌다");
	y=y+1;
	System.out.println("사용자"+ x + "대 컴퓨터" + y);}
else if(n.equals("보")&&(m==2||m==5||m==8)) {
	System.out.println("이겼다");
	x=x+1;
	System.out.println("사용자"+ x + "대 컴퓨터" + y);}
else if(n.equals("보")&& m==3||m==6||m==9) {
	System.out.println("비겼다(서로0점)");
    System.out.println("사용자"+x +"대 컴퓨터" +y);}
else if (n.equals("바위") && (m==1||m==4||m==7)) {
	System.out.println("이겼다");
	x=x+1;
	System.out.println("사용자"+ x + "대 컴퓨터" + y);}
else if(n.equals("바위")&&(m==2||m==5||m==8)) {
	System.out.println("비겼다(서로0점)");
	System.out.println("사용자"+ x + "대 컴퓨터" + y);}
else if(n.equals("바위")&& m==3||m==6||m==9) {
	System.out.println("졌다");
	y=y+1;
    System.out.println("사용자"+x +"대 컴퓨터" +y);}
else if (n.equals("가위") && (m==1||m==4||m==7)) {
	System.out.println("비겼다(서로0점)");
	System.out.println("사용자"+ x + "대 컴퓨터" + y);}
else if(n.equals("가위")&&(m==2||m==5||m==8)) {
	System.out.println("졌다");
	y=y+1;
	System.out.println("사용자"+ x + "대 컴퓨터" + y);}
else if(n.equals("가위")&& m==3||m==6||m==9) {
	System.out.println("이겼다");
	x=x+1;
    System.out.println("사용자"+x +"대 컴퓨터" +y);}
}
sc.close();
	}

}
