import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here
      Scanner in = new Scanner(System.in);
      String s1=in.nextLine();  
      String r =in.nextLine();
      String i =in.nextLine();
     
     String replaceString=s1.replaceAll( r,i );
     System.out.println(replaceString);
    }
}