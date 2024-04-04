'''
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
'''
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String nstr="";
        char ch;
        /* Enter your code here. Print output to STDOUT. */
        for (int i=0; i<A.length(); i++)
      {
        ch= A.charAt(i); 
        nstr= ch+nstr; 
      }
      if(A.equals(nstr)){
          System.out.println("Yes");
      }
      else{
          System.out.println("No");
      }
    }
}

