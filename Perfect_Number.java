import java.util.Scanner;
class P
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,su=0;
        n=s.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                su=su+i;
            }
        }
        if(su==n)
          System.out.print("True");
        else
          System.out.print("False");
    }
}