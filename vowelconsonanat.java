import java.util.Scanner;
import java.util.*;
class consonantsvowels{	
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.print("Given word:   ");
		String a=sc.nextLine();
		List<String> vowel= new ArrayList<String> ();
		List<String> consonant= new ArrayList<String>();
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowel.add(ch+" ");
			}
			else
			{
				consonant.add(ch+" ");
			}
		}
		System.out.print("vowel: "+vowel);
		System.out.println();
		System.out.println("consonant: "+consonant);
	}
}
