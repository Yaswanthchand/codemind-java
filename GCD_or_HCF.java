import java.util.*;
class Y
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0,h=0;
        for(int i=1;i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                c=1;
                if(c==1)
                {
                    h=i;
                }
            }
        }
        System.out.println(h);
    }
}