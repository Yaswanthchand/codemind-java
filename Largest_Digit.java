import java.util.Scanner;
class Large
{
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int r,max=0;
        while(n>0)
        {
            r=n%10;
            if(r>max)
            {
                max=r;
            }
            n=n/10;
        }
        System.out.print(max);
    }
}