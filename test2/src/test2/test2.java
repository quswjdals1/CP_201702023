package test2;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=0;
int y=1;
int z;
int n;

System.out.print("1��°"+x+" ");
System.out.print("2��°"+y+" ");

for(n=0; n<8; n++) {
	z=x+y;
	System.out.print((n+3)+"��°"+z+" ");
	x=y;
	y=z;
}	

	}
}
