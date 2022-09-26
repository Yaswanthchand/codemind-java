import java.util.*;
class solution
{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (ch=='V' || ch=='v'){
            System.out.print("Violet");
        }
        else if(ch=='I' || ch=='i'){
            System.out.print("Indigo");
        }
        else if(ch=='B' || ch=='b'){
            System.out.print("Blue");
        }
        else if(ch=='G' || ch=='g'){
            System.out.print("Green");
        }
        else if(ch=='Y' || ch=='y'){
            System.out.print("Yellow");
        }
        else if(ch=='O' || ch=='o'){
            System.out.print("Orange");
        }
        else if(ch=='R' || ch=='r'){
            System.out.print("Red");
        }
        else{
            System.out.print("-1");
        }
    }
}