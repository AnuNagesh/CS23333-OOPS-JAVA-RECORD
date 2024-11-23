CODE-1:
PROGRAM:
Write a program for pattern printing.
CODE:
import java.util.Scanner;
public class Sequence
{
    public static void main(String args[])
    {
        Scanner A=new Scanner(System.in);
        int n=A.nextInt();
        String t="1";
        for (int i=2;i<=n;i++)
        {
            t+=" "+i+" "+t;
        }
        System.out.println(t);
    }
}

CODE-2:

PROGRAM:
Write a program to set schedule.
CODE:
import java.util.Scanner;
public class Wake
{
    public static void main(String args[])
    {
        Scanner A=new Scanner(System.in);
        int d=A.nextInt();
        boolean v=A.nextBoolean();
        String wt;
        if(v)
        {
            if(d>1 && d<7)
            {
                wt="7:00";
            }
            else
            {
                wt="9:00";
            }
        }
        else
        {
            if(d>=2 && d<=5)
            {
                wt="5:00";
            }
            else
            {
                wt="6:00";
            }
        }
        System.out.println(wt);
    }
}

CODE-3:
PROGRAM:
Write a program to set schedule.
CODE:
import java.util.Scanner;
public class Wake
{
    public static void main(String args[])
    {
        Scanner A=new Scanner(System.in);
        int d=A.nextInt();
        boolean v=A.nextBoolean();
        String wt;
        if(v)
        {
            if(d>1 && d<7)
            {
                wt="7:00";
            }
            else
            {
                wt="9:00";
            }
        }
        else
        {
            if(d>=2 && d<=5)
            {
                wt="5:00";
            }
            else
            {
                wt="6:00";
            }
        }
        System.out.println(wt);
    }
}
