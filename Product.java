import java.io.*;
import java.util.*;
class Product
{
public static void main(String args[])
{
int aa=1;
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
if(i!=j)
{
aa=aa*b[i];
}
}
System.out.println(aa);
aa=1;
}
}
}
