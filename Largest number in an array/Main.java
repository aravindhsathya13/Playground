import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size=in.nextInt();
      int sum;
      int arr[] = new int[arr_size];
      for( int i=0;i<=(arr_size-1);i++)
      {
       arr[i]=in.nextInt();
      }
      sum=arr[0];
      for( int i=0;i<(arr_size);i++)
      {
         if(sum<arr[i])
         sum=arr[i];
         
      }
      System.out.print(sum);
   
       
    }
}
