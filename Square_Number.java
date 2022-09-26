import java.util.*;
class Y
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=0;i<a/2;i++)
        {
            for(int j=i+1;j<=(a/2);j++)
            {
            if((i*i)+(j*j)==a)
            {
              c=1;
              break;
            }
            }
            if(c==1)
            {
                break;
            }
        }
        if(c==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
    