import java.io.*;
import java.util.*;
class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer a=new StringBuffer(s);
        a.reverse();
        System.out.println(a);
    }
}
