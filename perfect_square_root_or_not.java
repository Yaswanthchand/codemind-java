import java.util.*;
class M
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=0;i<=n/2;i++)
        {
            if(i*i==n)
            {
                c=1;
            }
        }
        if(c==1)
            System.out.print("True");
         else
            System.out.print("False");
    }
}