import java.io.*;
import java.util.*;
class rev1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,sum=0;
        while(a!=0)
        {
        b=a%10;
        a=a/10;
        sum=b;
        System.out.print(sum);
        }
    }
}
