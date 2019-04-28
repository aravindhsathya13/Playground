import java.util.Scanner;
public class Main{

      static int countFreq(String pat, String txt) {         
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
        return res;         
    } 
    static public void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        String txt = in.nextLine();         
        String pat = in.nextLine();         
        System.out.println(countFreq(pat, txt));    
     
}
}