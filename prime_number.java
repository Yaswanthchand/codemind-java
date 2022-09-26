import java.util.*;
class Y
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
            }
        }
        if(f==1)
            System.out.print("not a prime");
        else
            System.out.print("prime");
    }
}