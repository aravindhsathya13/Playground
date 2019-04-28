import java.util.Scanner;
class Main
{public static int pow(int base,int exp)
{  int pro = 1;
   for (int i=1;i<=exp;i++)
     pro = pro*base;
 return pro;
}
  
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
   int b = in.nextInt();
   int e = in.nextInt();
   int power = pow(b,e);
   System.out.println(power);
 }
}