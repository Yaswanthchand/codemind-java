import java.util.Scanner;
class Rev
{
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int r,re=0;
        while(n>0)
        {
            r=n%10;
            re=re*10+r;
            n=n/10;
        }
        System.out.print(re);
    }
}