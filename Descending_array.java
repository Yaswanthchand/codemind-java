import java.util.Scanner;
class y
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] x=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            x[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(x[i]<x[i+1])
            {
                c+=1;
            }
        }
        if(c>0)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }
    }
}