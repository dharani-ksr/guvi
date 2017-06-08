import java.io.*;
import java.util.*;
class ind
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
for(i=0;i<a;i++)
{
b[i]=sc.nextInt();
}			
for(i=0;i<a;i++)
{
if(b[i]==i)
{
System.out.println(b[i]);
}
}
}
}
