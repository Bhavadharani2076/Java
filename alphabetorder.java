import java.lang.*;
import java.util.*;
class alphabet{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the word : ");
        String x=sc.nextLine();
        int n=x.length();
        char temp;
        char arr[]=String.toCharArray();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        a.close();
        String str1= new String(arr);
        System.out.print(str1);
    }

    private static String extracted() {
        return "Enter the word : ";
    }
}