import java.util.Scanner;
class Y
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        if(n<0)
        {
            n=n*(-1);
        }
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        if(temp<0)
        {
            rev=rev*-1;
        }
        System.out.print(rev);
        
    }
}