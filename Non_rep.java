import java.io.*;
import java.util.*;
class Non_rep
{
public static void main(String args[])
{
String str="";
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
str=str+String.valueOf(b[i]);
}
char[] ch=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
for(int j=i+1;j<ch.length;j++)
{
if(ch[i]==ch[j])
{
str=str.replace(String.valueOf(ch[i]),"");
}
}
}
System.out.println(str);
}
}
