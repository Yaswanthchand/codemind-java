import java.util.Scanner;
class max
{
    public static void main(String args[])
    {
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=n*(n-1)/2;
        System.out.print(m);
    }
}