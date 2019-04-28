import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size=in.nextInt();
      int count1=0;
      int count2=0;
      int j,k,flag=0;
      int arr[] = new int[arr_size];
      for(int i=0;i<=(arr_size-1);i++)
      {
       arr[i]=in.nextInt();
      }
      int se1=in.nextInt();
      int se2=in.nextInt();
      for(j=0; j<=(arr_size-1);j++)
      {
        if(arr[j]==se1)
         break;
      }
       System.out.println(j);
      for( k=0; k<(arr_size-1);k++)
      {
        if(arr[k]==se2)
         { flag=1; 
          break;}
        }
        if(flag==1)
           System.out.println(k);
        else
           System.out.println("-1"); 
      
       
    }
 }
