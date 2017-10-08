import java.io.*;
import java.util.*;
class Sum_pal
{
public static void main(String args[])
{
int sum=0,rem=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
while(a!=0)
{
rem=a%10;
sum=sum+rem;
a=a/10;
}
String s=String.valueOf(sum);
String s1=s;
s1=new StringBuffer(s1).reverse().toString();
System.out.println(s1);
if(s.equals(s1))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}
}
