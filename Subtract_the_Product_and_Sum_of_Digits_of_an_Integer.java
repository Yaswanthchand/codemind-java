import java.util.Scanner;
class S
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int r,su=0,p=1;
        while(n>0)
        {
            r=n%10;
            su=su+r;
            p=p*r;
            n=n/10;
        }
        System.out.println(p-su);
    }
}