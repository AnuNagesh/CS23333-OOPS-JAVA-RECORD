CODE-1:
PROBLEM:
Write a program to find whether given number is odd or even.


CODE:
import java.util.Scanner;
public class Oddeven
{
public static void main(String args[])
{
Scanner A=new Scanner(System.in);
int a=A.nextInt();
if(a%2==0)
System.out.println("1");
else
System.out.println("2");
}
}

CODE-2:
PROGRAM:
Write a java program to print last digit.

CODE:

import java.util.Scanner;
import java.lang.Math;
public class Last
{
    public static void main(String args[])
    {
        Scanner A=new Scanner(System.in);
        int a=A.nextInt();
        int b=Math.abs(a);
        System.out.println(b%10);
    }
}

CODE-3:

PROBLEM:
Write a java program to sum last digit of 2 number.
CODE:
import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        Scanner A=new Scanner(System.in);
        int a=A.nextInt();
        int b=A.nextInt();
        int c=Math.abs(a);
        int d=Math.abs(b);
        int e=(c%10)+(d%10);
        System.out.println(e);
    }
}
