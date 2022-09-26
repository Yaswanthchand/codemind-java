import java.util.Scanner;
class Y
{
    static int div(int n,int gdp)  
    {  
        while(n%gdp==0) 
        {
            n=n/gdp;  
        }
        return n;  
    }  
    static boolean checkUglyNumber(int n)  
    {  
        n=div(n,2);  
        n=div(n,3);  
        n=div(n,5);  
        return(n==1)?true:false;  
    }  
    public static void main(String args[])  
    {  
        Scanner s=new Scanner(System.in);  
        int n=s.nextInt();  
        if (checkUglyNumber(n))   
                        System.out.println("Ugly Number");   
                else  
                        System.out.println("Not Ugly Number");  
          
    }
}