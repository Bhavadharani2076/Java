import java.util.Scanner;
class numberoffactors{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Given number : ");	
		int a=sc.nextInt();
		int c=0;
		for(int i=1;i<=a;i++)			
		{
			if(a%i==0)
			{
				c=c+1;
			}
		}
		System.out.println("Number of factors : "+c);


	}
}
