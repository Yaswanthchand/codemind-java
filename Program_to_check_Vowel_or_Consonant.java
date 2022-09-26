import java.util.*;
class Vc
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.print("Vowel");
        }
        else if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("Consonant");
        }
    }
}