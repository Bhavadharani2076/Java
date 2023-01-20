import java.util.Scanner;
class Pascal{
	public static void main(String args[]){
		int num,n,i,j,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			num=1;
			for(k=0;k<=i;k++)
			{
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}
	}
}
