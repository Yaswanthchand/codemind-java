import java.util.Scanner;
class Ab
{
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int r,su=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                r=i;
                su=su+r;
            }
        }
        int temp=su-n;
        if(temp>n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}