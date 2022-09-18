import java.util.Scanner;
class N
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    int n;
    n=s.nextInt();
    int n1=n*n;
    int r,su=0;
    while(n1>0)
    {
        r=n1%10;
        su=su+r;
        n1=n1/10;
    }
    if(su==n)
    {
        System.out.println("Neon Number");
    }
    else
    {
        System.out.println("Not Neon Number");
    }
    }
}