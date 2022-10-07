import java.util.Scanner;
class y
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0,k=0;
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int y[]=new int[m];
        for(int j=0;j<m;j++)
        {
            y[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<m;j++)
            {
                if(x[i]==y[j])
                {
                    c=1;
                    y[j]=-1;
                }
            }
            if(c==1)
            {
                k++;
            }
        }
        System.out.println(k);
    }
}