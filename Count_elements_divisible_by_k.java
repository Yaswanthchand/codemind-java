import java.util.Scanner;
class Y
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int c=0;
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}