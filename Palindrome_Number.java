import java.util.Scanner;
class Y
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=1;j<=n;j++)
        {
            int a=sc.nextInt();
            int temp=a,r,rev=0;
            while(a>0)
            {
                r=a%10;
                a=a/10;
                rev=rev*10+r;
            }
            if(rev==temp)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");   
            }
        }
    }
}