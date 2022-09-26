import java.util.*;
class Y
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=0,i=1,c=0,s=0;
		a=n;
		int d=(int)Math.log10(n);
	    while(n>0)
	    {
	        c=n/(int)(Math.pow(10,d));
	        n=n%(int)(Math.pow(10,d));
	        s=s+(int)(Math.pow(c,i));
	        d=d-1;
	        i=i+1;
	    }
	    if(s==a)
	    {
	        System.out.println("True");
	    }
	    else
	    {
	        System.out.println("False");
	    }
		 
	}

}
