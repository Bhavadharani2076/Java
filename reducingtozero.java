import java.util.Scanner;
class a{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();    
		int count=0;
		while(n!=0)
		{
			if(n%2==0)
			{
				n=n/2;
				count=count+1;
			}
			else
			{
				n=n-1;
				  
				count=count+1;    
			}
			
		}
		System.out.print(count);
	}
}
			