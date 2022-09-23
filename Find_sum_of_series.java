import java.util.Scanner;
class S
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+(float)1/i;
        }
        System.out.format("%.2f",sum);
    }
}