import java.util.Scanner;
class decimalsquarecube{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float a=sc.nextfloat();
		float b=a*a;
		float c=a*a*a;
		System.out.println("Square of a decimal number : "+b);
		System.out.println("Cube of a decimal number : "+c);
	}
}
