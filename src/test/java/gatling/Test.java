package gatling;

import java.util.Scanner;

public class Test {
	
	private int fibo(int n)
	{
		if(n==1)
			return 1;
		else if(n==2)
		    return 1;
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Test test=new Test();
		System.out.println(test.fibo(n));
	}
}
