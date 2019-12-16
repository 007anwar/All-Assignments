package core;

import java.util.Scanner;

public class pattern {
public static void main(String[] args) {
	int x;
	System.out.println("Enter no");
Scanner s=new Scanner(System.in);
int num = s.nextInt();
System.out.println(num);
for(int i=1;i<=num;i++)
{
	for(int j=i;;j++)
	{
		x=j;
		System.out.println(x);
		x=x+j;
	}
}
}
}
