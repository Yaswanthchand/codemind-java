import java.util.Scanner;
class prime
{
	public static boolean isprime(int n) 
	{
		if(n<=1)
		{
			return false;
		}
	
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c=0,s=0,a=0;
        float avg;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            a=x[i];
            if(isprime(a))
            {
                c+=1;
                s+=x[i];
            }
            a=0;
        }
        avg=(float)s/c;
        System.out.format("%.2f",avg);
    }
}