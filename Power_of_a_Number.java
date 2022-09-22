import java.util.Scanner;
class P
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x,y,n,r,res;
        x=s.nextInt();
        y=s.nextInt();
        n=s.nextInt();
        r=(int)Math.pow(x,y);
        res=r%n;
        System.out.print(res);
    }
}