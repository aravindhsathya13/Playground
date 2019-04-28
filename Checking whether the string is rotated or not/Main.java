import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String pat = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      String txt = str+sb;
   
      
      
       int M = pat.length();         
        int N = txt.length();         
        int res = 0; 
  
       
        for (int i = 0; i <= N - M; i++) { 
           
            int j;             
            for (j = 0; j < M; j++) { 
                if (txt.charAt(i + j) != pat.charAt(j)) { 
                    break; 
                } 
            } 
  
           
            if (j == M) {                 
                res++;                 
                j = 0;                 
            }             
        }
      if(res>0)
        System.out.print("Yes");
      else
        System.out.print("No");
      
    }
}