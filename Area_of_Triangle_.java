import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        int a,b,c;
        Double s,r;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        s=(double)(a+b+c)/2;
        r=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",r);
        
    }
}