import java.util.Scanner;
class SumOfMatrix{
	public static void main(String argss[]){
		int row1,row2,col1,col2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		row1=sc.nextInt();
		System.out.println("Enter the number of columns : ");
		col1=sc.nextInt();
		int[][] mat1=new int[row1][col1];
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the number of rows: ");
		row2=sc.nextInt();
		System.out.println("Enter the number of columns : ");
		col2=sc.nextInt();
		int[][] mat2=new int[row2][col2];
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		int[][] result=new int[row1][col2];
		for(int s=0;s<row1;s++)
		{
			for(int r=0;r<col2;r++)
			{	
				result[s][r]=0;
				result[s][r]=result[s][r]+(mat1[s][r]+mat2[s][r]);
			}
		}
		for(int m=0;m<row1;m++)
		{
			for(int n=0;n<col2;n++)
			{
				System.out.print(result[m][n]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
