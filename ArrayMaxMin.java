import java.util.Scanner;
class ArrayMaxMin{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=a.nextInt();
		}
		int max=array[0];
		for(int j=0;j<n;j++)
		{
			if(array[j]>max)
			{
				max=array[j];
			}
		}
		System.out.println("Maximum = "+max);
		int min=array[0];
		for(int s=0;s<n;s++)
		{
			if(array[s]<min)
			{
				min=array[s];
			}
		}
		System.out.println("Minimum = "+min);
		System.out.println("Addition of Maximum and Minimum = "+(max+min));
		System.out.println("Subtraction of Maximum and Minimum = "+(max-min));
	}
}
