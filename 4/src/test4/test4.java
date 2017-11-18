package test4;

import java.util.Random;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rand = new Random();

int randomNum = rand.nextInt(101)+0;
int x[] = new int[10];
int min=100;
int max=0;

for(int i=0; i<=9; i++)
	x[i]=rand.nextInt(101)+0;


for(int y=0; y<=9; y++)
	if(x[y]<=min)
		min=x[y];

for(int n=0; n<=9; n++)
	if(x[n]>=max)
		max=x[n];

System.out.print("10개중 가장 큰 수는: "+max);
System.out.println("");
System.out.print("10개중 가장 작은 수는: "+min);
	
	
		

	}

}
