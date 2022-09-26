import java.util.*;
class Y
{
    public static int rev(int n)
    {
        int i,c=0;
        while(n>0)
        {
            i=n%10;
            n=n/10;
            c=c*10+i;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=0,x=0,y=0,z=0;
        m=n*n;
        x=rev(n);
        y=x*x;
        z=rev(y);
        if(m==z)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}