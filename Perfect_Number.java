import java.util.Scanner;
class Y
{
    public static int isperfect(int num)
    {
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner  s=new  Scanner(System.in);
        int n=s.nextInt();
        int res=isperfect(n);
        if(res==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    
}