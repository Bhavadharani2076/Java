import java.util.Scanner;
class frequency{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			a[i][0]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			a[i][1]=1;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i][0]==a[j][0])
				{
					a[j][0]=-1;
					a[i][1]=a[i][1] +1;
				}
			}
		}
		System.out.println("The output table :");
		System.out.println("Element | Frequency ");
		System.out.println("--------------------");
		for(int i=0;i<n;i++)
		{
			if(a[i][0]!=-1){
				System.out.print(a[i][0]+" | "+a[i][1]);
			}
			System.out.println();
		}
	}
}
	