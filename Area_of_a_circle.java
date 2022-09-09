import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        int r;
        float area;
        Scanner s=new Scanner(System.in);
        r=s.nextInt();
        area=(float)(3.14*r*r);
        System.out.format("%.2f",area);
        
    }
}