import java.util.Scanner;
class Revpal{
	public static int rev(int m){
		int rem,rev=0;
		while(m!=0)
		{
			rem=m%10;
			rev=rev*10+rem;
			m=m/10;
		}
		return rev;
	}
	public static void main(String args[]){
		Revpal r=new Revpal();
		Scanner sc=new Scanner(System.in);
		int n,i,palin=0;
		n=sc.nextInt();
		int m=n;
		int a=rev(m);
		while(a!=m)
		{
			m=m+a;
			a=rev(m);
		}	
		System.out.println(a);
	}
}
