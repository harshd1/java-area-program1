import java.util.Scanner;
class Area
{
 public static void main(String[] args)
 {
   double area;
   Scanner sc= new Scanner(System.in);
   System.out.print("enter radius:");
   int r =sc.nextInt();
   double pi = 3.14;
   area = pi*r*r;
   System.out.print("Area of circle:"+area);
 }

}
