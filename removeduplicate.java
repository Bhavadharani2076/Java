import java.util.Scanner;
import java.util.*;
class removeduplicate{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0; i<n; i++)
		{
			int a=sc.nextInt();
			list.add(a);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0; j<n; j++)
			{
				if(list.charAt(i)==list.charAt(j))
				{
					list.delete(j);
				}
			}
		}
		System.out.print(list);
	}
}
