import java.io.*;
import java.util.*;
class Arr_sum
{
public static void main(String args[])
{
int sum=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] b=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
for(int j=0;j<a;j++)
{
sum=b[i]+b[j];
if(sum==0)
{
System.out.println(b[i]+" "+b[j]);
}
break;
}
}
}
}
