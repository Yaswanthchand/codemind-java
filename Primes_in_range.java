import java.util.*;
class Y
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0,d=0;
        if(a==1)
        {
            a=2;
        }
        for(int i=a;i<=b;i++)
        {
            d+=1;
            for(int j=2;j<Math.sqrt(i)+1;j++)
            {
                if(i%j==0 && i!=2)
                {
                    c+=1;
                    break;
                }
            }
        }
        System.out.println(d-c);
    }
}