import java.util.Scanner;
class Y
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1,sum=0;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}