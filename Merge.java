//WAP to merge 2 arrays 
import java.io.*;
class Merge
{
   public static void main(String args[])throws IOException
   {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      int A[] = new int [6];
      int B[] = new int [4];
      int C[] = new int [10];
      System.out.println("Enter 6 numbers for array A");
      for(int i = 0; i < 6; i++)
      {
         A[i] = Integer.parseInt(br.readLine());
        }
      System.out.println("Enter 4 numbers for array B");
      for(int i = 0; i < 4; i++)
      {
         B[i] = Integer.parseInt(br.readLine());
        }
      System.out.println("The array C is as follows-");  
      System.out.println("");  
      for(int i = 0; i < 6; i++)
      {
         C[i] = A[i];
        }
      for(int i = 0; i < 4; i++)
      {
         C[i+6] = B[i];
        }  
      for(int i = 0; i < 10; i++)
      {
         System.out.println(C[i]);  
        }  
    }
}
