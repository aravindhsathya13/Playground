import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++)
      arr[i]=in.nextInt();
    for(int i=0;i<size;i++)
    {
      if(arr[i]!=0)
         System.out.print(arr[i]+" ");
    }
    for(int i=0;i<size;i++)
    {
      if(arr[i]==0)
         System.out.print(arr[i]+" ");
    }
  }
}