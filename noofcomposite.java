import java.util.Scanner;
class com{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the elements : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0,m=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=2;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					c=c+1;
				}
			}
			if(c>2)
			{
				count=count+1;
			}
			else
			{
				m=m+1;
			}
		}
		System.out.print(count+","+m);
	}
}
	
		