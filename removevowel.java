import java.util.Scanner;
class removevowel{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="";
		int n=str.length();
		for(int i=0;i<n;i++)
		{y
			char c=(str.charAt(i));
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
				continue;
			}
			else{
				str1=str1+c;
			}
		}
		System.out.print(str1);
	}
}