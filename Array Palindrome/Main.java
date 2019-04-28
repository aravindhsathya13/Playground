import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[]=new int [n];
	  for(int i=0; i<n;i++)
        arr[i]=in.nextInt();
      int max=0;
      for(int i=0; i<n;i++)
      {
       	 if(arr[i]==arr[n-1]){
           n=n-1;
           continue;
         }
         else{
           max=max+1;
          System.out.println("No");
          break;
        }
          
      }
      if (max==0)
        System.out.println("Yes");
    }
}