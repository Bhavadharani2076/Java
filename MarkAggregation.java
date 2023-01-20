import java.util.Scanner;
class MarkAggregation{
	public static void main(String args[]){
		int a,b,c,d,i,total;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a marks in python : ");
		a=sc.nextInt();
		System.out.print("Enter a marks in C Programming : ");
		b=sc.nextInt();
		System.out.print("Enter a marks in Mathematics : ");
		c=sc.nextInt();
		System.out.print("Enter a marks in Physics : ");
		d=sc.nextInt();
		total=a+b+c+d;
		System.out.println(total);
		double aggregate=(total*100)/400.0;
		System.out.println(aggregate);
		if(aggregate>=75 && aggregate<=100)
		{
			System.out.println("DISTINCTION");	
		}
		else if(60>=aggregate && aggregate<75)
		{
			System.out.println("First Division");	
		}
		else if(50>=aggregate && aggregate<=60)
		{
			System.out.println("Second Division");
		}
		else if(40>=aggregate && aggregate<=50)
		{
			System.out.println("Third Division");	
		}
		else if(aggregate<40)
		{
			System.out.println("Fail");
		}
	}
}